package com.example.gominbreakbackend.domain.comment.presentation;

import com.example.gominbreakbackend.domain.comment.presentation.dto.CommentRequest;
import com.example.gominbreakbackend.domain.comment.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @PostMapping("")
    public void createComment(CommentRequest request){
        commentService.createComment(request);
    }
}
