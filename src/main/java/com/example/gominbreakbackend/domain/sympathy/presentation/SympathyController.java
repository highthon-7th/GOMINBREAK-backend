package com.example.gominbreakbackend.domain.sympathy.presentation;

import com.example.gominbreakbackend.domain.comment.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SympathyController {

    private final CommentService commentService;

    @PostMapping("/sym/{comment-id}")
    public void addSym(@PathVariable(name = "comment-id") Integer id){
        commentService.addSym(id);
    }
}
