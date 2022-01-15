package com.example.gominbreakbackend.domain.entity.repository;

import com.example.gominbreakbackend.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
}
