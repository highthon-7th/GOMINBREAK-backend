package com.example.gominbreakbackend.domain.comment.service;

import com.example.gominbreakbackend.domain.comment.domain.Comment;
import com.example.gominbreakbackend.domain.comment.domain.repository.CommentRepository;
import com.example.gominbreakbackend.domain.comment.presentation.dto.request.CommentRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    public void createComment(CommentRequest request){
        commentRepository.save(Comment.builder()
                        .commentContent(request.getCommentContent())
                        .build());
    }
}
