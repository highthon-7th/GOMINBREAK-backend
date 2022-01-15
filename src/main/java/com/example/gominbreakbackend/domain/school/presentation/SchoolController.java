package com.example.gominbreakbackend.domain.school.presentation;

import com.example.gominbreakbackend.domain.school.domain.School;
import com.example.gominbreakbackend.domain.school.presentation.dto.SchoolResponse;
import com.example.gominbreakbackend.domain.school.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService schoolService;

    @GetMapping("/search")
    public List<SchoolResponse> searchSchool(@RequestParam(name = "school") String school, Pageable pageable){
        return schoolService.searchSchool(school, pageable);
    }
}
