package com.example.gominbreakbackend.domain.comment.service;

import com.example.gominbreakbackend.domain.comment.domain.Comment;
import com.example.gominbreakbackend.domain.comment.domain.repository.CommentRepository;
import com.example.gominbreakbackend.domain.comment.presentation.dto.request.CommentRequest;
import com.example.gominbreakbackend.domain.post.domain.repository.PostRepository;
import com.example.gominbreakbackend.domain.user.facade.MemberFacade;
import com.example.gominbreakbackend.global.exception.PostNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    public void addComment(Integer postId, CommentRequest request){

        commentRepository.save(Comment.builder()
                        .commentContent(request.getCommentContent())
                        .member(MemberFacade.getMember())
                        .post(postRepository.findById(postId)
                                .orElseThrow(() -> PostNotFoundException.EXCEPTION))
                        .build());
    }
}
