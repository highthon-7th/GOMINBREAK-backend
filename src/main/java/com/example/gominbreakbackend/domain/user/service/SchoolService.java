package com.example.gominbreakbackend.domain.service;

import com.example.gominbreakbackend.domain.entity.School;
import com.example.gominbreakbackend.domain.entity.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;

    public List<School> searchSchool(String school, Pageable pageable){
        return schoolRepository.findBySchoolNameContaining(school, pageable);
    }
}
