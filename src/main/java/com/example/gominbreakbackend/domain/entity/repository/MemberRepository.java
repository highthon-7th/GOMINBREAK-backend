package com.example.gominbreakbackend.domain.entity.repository;

import com.example.gominbreakbackend.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    Optional<Member> findByUsername(String username);
}
