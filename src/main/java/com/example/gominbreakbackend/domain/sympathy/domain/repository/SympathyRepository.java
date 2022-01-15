package com.example.gominbreakbackend.domain.sympathy.domain.repository;

import com.example.gominbreakbackend.domain.sympathy.domain.Sympathy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SympathyRepository extends JpaRepository<Sympathy, Integer> {
}
