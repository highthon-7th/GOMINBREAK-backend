package com.example.gominbreakbackend.domain.rank.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class RankSchoolResponse {

    private String schoolName;
    private Integer symCounts;
}
