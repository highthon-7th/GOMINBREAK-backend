package com.example.gominbreakbackend.domain.user.domain.repository;

import com.example.gominbreakbackend.domain.user.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    Optional<Member> findByUsername(String username);
}
