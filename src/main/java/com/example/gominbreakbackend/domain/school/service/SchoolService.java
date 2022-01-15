package com.example.gominbreakbackend.domain.school.service;

import com.example.gominbreakbackend.domain.school.domain.School;
import com.example.gominbreakbackend.domain.school.domain.repository.SchoolRepository;
import com.example.gominbreakbackend.domain.school.presentation.dto.SchoolResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class SchoolService {

    private final SchoolRepository schoolRepository;

    public List<SchoolResponse> searchSchool(String school, Pageable pageable){
        return schoolRepository.findBySchoolNameContaining(school, pageable)
                .stream()
                .map(school1 -> {
                    SchoolResponse response = SchoolResponse.builder()
                            .schoolName(school1.getSchoolName())
                            .location(school1.getLocation())
                            .build();
                    return response;
                })
                .collect(Collectors.toList());
    }
}
