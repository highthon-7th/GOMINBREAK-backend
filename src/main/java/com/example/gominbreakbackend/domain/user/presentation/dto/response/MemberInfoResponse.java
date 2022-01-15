package com.example.gominbreakbackend.domain.user.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class MemberInfoResponse {

    private String name;
    private Integer commentCounts;
    private Integer symCounts;
    private String schoolName;
}
