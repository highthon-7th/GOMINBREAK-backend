package com.example.gominbreakbackend.domain.post.presentation.dto.response;

import com.example.gominbreakbackend.domain.comment.domain.Comment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
@Builder
public class PostDetailsResponse {

    private String title;
    private String content;
    private String name;

    private List<Comment> commentContents;
}
