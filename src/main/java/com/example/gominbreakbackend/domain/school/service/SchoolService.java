package com.example.gominbreakbackend.domain.school.service;

import com.example.gominbreakbackend.domain.school.domain.School;
import com.example.gominbreakbackend.domain.school.domain.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SchoolService {

    private final SchoolRepository schoolRepository;

    public List<School> searchSchool(String school, Pageable pageable){
        return schoolRepository.findBySchoolNameContaining(school, pageable);
    }
}
