package com.example.gominbreakbackend.domain.post.presentation.dto.response;

import com.example.gominbreakbackend.domain.comment.domain.Comment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
@Builder
public class PostResponse {

    private Integer id;
}
