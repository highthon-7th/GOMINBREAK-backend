package com.example.gominbreakbackend.domain.comment.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class CommentResponse {

    private Integer id;
    private String writer;
}
