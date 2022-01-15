package com.example.gominbreakbackend.domain.rank.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RankMemberResponse {

    private String name;
    private String school;
    private Integer symCounts;
}
