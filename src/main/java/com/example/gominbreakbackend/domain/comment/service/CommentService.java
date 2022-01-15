package com.example.gominbreakbackend.domain.comment.service;

import com.example.gominbreakbackend.domain.comment.domain.Comment;
import com.example.gominbreakbackend.domain.comment.domain.repository.CommentRepository;
import com.example.gominbreakbackend.domain.comment.presentation.dto.request.CommentRequest;
import com.example.gominbreakbackend.domain.post.domain.repository.PostRepository;
import com.example.gominbreakbackend.domain.sympathy.domain.Sympathy;
import com.example.gominbreakbackend.domain.sympathy.domain.repository.SympathyRepository;
import com.example.gominbreakbackend.domain.user.domain.Member;
import com.example.gominbreakbackend.domain.user.facade.MemberFacade;
import com.example.gominbreakbackend.global.error.exception.GominException;
import com.example.gominbreakbackend.global.exception.AuthenticationNotFoundException;
import com.example.gominbreakbackend.global.exception.CommentNotFoundException;
import com.example.gominbreakbackend.global.exception.PostNotFoundException;
import com.example.gominbreakbackend.global.exception.SymAlreadyExistsException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;
    private final SympathyRepository sympathyRepository;

    @Transactional
    public void addComment(Integer postId, CommentRequest request){

        commentRepository.save(Comment.builder()
                        .commentContent(request.getCommentContent())
                        .member(MemberFacade.getMember())
                        .post(postRepository.findById(postId)
                                .orElseThrow(() -> PostNotFoundException.EXCEPTION))
                        .symCounts(0)
                        .build());
    }

    @Transactional
    public void addSym(Integer id){
        Member member = MemberFacade.getMember();

        Comment comment = commentRepository.findById(id)
                .orElseThrow(() -> CommentNotFoundException.EXCEPTION);

        try {
            sympathyRepository.save(
                    Sympathy.builder()
                            .member(member)
                            .comment(comment)
                            .build()
                );
                comment.addSymCommentCounts();
                comment.getMember().addSymCounts();
                comment.getMember().getSchoolE().addSchoolSymCounts();
        } catch (GominException e){
            throw SymAlreadyExistsException.EXCEPTION;
        }
    }
}
