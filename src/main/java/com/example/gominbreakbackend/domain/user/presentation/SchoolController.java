package com.example.gominbreakbackend.domain.user.presentation;

import com.example.gominbreakbackend.domain.user.domain.School;
import com.example.gominbreakbackend.domain.user.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService schoolService;

    @GetMapping("/search")
    public List<School> searchSchool(@RequestParam(name = "school") String school, Pageable pageable){
        return schoolService.searchSchool(school, pageable);
    }
}
