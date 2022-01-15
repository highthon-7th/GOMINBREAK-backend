package com.example.gominbreakbackend.domain.user.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class MyPageResponse {

    private String title;
    private String content;
}
