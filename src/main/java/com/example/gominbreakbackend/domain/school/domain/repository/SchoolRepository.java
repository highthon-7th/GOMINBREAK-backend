package com.example.gominbreakbackend.domain.school.domain.repository;

import com.example.gominbreakbackend.domain.school.domain.School;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolRepository extends JpaRepository<School, Integer> {
    List<School> findBySchoolNameContaining(String school, Pageable pageable);
}
