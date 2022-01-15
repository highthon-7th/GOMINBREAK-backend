package com.example.gominbreakbackend.domain.entity.repository;

import com.example.gominbreakbackend.domain.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface SchoolRepository extends JpaRepository<School, Integer> {
    List<School> findBySchoolNameContaining(String school, Pageable pageable);
}
