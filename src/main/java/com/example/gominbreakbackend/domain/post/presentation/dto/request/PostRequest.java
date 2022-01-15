package com.example.gominbreakbackend.domain.post.presentation.dto.request;

import com.example.gominbreakbackend.domain.user.domain.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class PostRequest {

    private String title;
    private String contents;
    private Member member;
}
