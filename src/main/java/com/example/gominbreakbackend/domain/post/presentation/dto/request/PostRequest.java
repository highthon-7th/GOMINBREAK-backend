package com.example.gominbreakbackend.domain.post.presentation.dto.request;

import com.example.gominbreakbackend.domain.user.domain.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@Getter
public class PostRequest {

    @NotBlank
    private String title;

    @NotBlank
    private String content;

}
