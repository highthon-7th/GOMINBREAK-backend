package com.example.gominbreakbackend.domain.comment.presentation.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
public class CommentRequest {

    private String comment;
}
