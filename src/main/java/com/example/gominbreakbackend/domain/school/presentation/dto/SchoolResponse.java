package com.example.gominbreakbackend.domain.school.presentation.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class SchoolResponse {

    private String schoolName;
    private String location;
}
