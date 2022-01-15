package com.example.gominbreakbackend.domain.entity.repository;

import com.example.gominbreakbackend.domain.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
