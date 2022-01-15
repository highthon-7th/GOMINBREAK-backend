package com.example.gominbreakbackend.domain.post.presentation.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Builder
public class PostRequest {

    private String title;
    private String contents;
}
