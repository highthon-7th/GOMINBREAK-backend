package com.example.gominbreakbackend.domain.user.domain.repository;

import com.example.gominbreakbackend.domain.user.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    Optional<Member> findByUsername(String username);

    @Query(value = "select * from tbl_member order by symCounts desc", nativeQuery = true)
    List<Member> findBySymRank();
}
