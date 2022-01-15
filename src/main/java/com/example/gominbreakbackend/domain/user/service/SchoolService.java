package com.example.gominbreakbackend.domain.user.service;

import com.example.gominbreakbackend.domain.user.domain.School;
import com.example.gominbreakbackend.domain.user.domain.repository.SchoolRepository;
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
