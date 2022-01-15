package com.example.gominbreakbackend.domain.rank.service;

import com.example.gominbreakbackend.domain.rank.presentation.dto.RankMemberResponse;
import com.example.gominbreakbackend.domain.rank.presentation.dto.RankSchoolResponse;
import com.example.gominbreakbackend.domain.school.domain.repository.SchoolRepository;
import com.example.gominbreakbackend.domain.user.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RankService {

    private final MemberRepository memberRepository;
    private final SchoolRepository schoolRepository;

    public List<RankMemberResponse> memberRank(){
        return null;
    }

    public List<RankSchoolResponse> schoolRank(){
        return null;
    }
}
