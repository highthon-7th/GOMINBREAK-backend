package com.example.gominbreakbackend.domain.comment.presentation;

import com.example.gominbreakbackend.domain.comment.presentation.dto.request.CommentRequest;
import com.example.gominbreakbackend.domain.comment.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @PostMapping("/comment")
    public void createComment(@RequestBody @Valid CommentRequest request){
        commentService.createComment(request);
    }
}
