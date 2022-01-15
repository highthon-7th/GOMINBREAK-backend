package com.example.gominbreakbackend.domain.user.domain.repository;

import com.example.gominbreakbackend.domain.user.domain.School;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface SchoolRepository extends JpaRepository<School, Integer> {
    List<School> findBySchoolNameContaining(String school, Pageable pageable);
}
