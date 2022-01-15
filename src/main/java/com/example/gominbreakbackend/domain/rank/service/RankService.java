package com.example.gominbreakbackend.domain.rank.service;

import com.example.gominbreakbackend.domain.rank.presentation.dto.RankMemberResponse;
import com.example.gominbreakbackend.domain.rank.presentation.dto.RankSchoolResponse;
import com.example.gominbreakbackend.domain.school.domain.repository.SchoolRepository;
import com.example.gominbreakbackend.domain.user.domain.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RankService {

    private final MemberRepository memberRepository;
    private final SchoolRepository schoolRepository;

    public List<RankMemberResponse> memberRank(){
        return memberRepository.findBySymRank()
                .stream()
                .map(member -> {
                    RankMemberResponse response = RankMemberResponse.builder()
                            .name(member.getName())
                            .school(member.getSchool())
                            .symCounts(member.getSymCounts())
                            .build();
                    return response;
                })
                .collect(Collectors.toList());
    }

    public List<RankSchoolResponse> schoolRank(){
        return schoolRepository.findBySymRank()
                .stream()
                .map(school -> {
                    RankSchoolResponse response = RankSchoolResponse.builder()
                            .schoolName(school.getSchoolName())
                            .symCounts(school.getSymCounts())
                            .build();
                    return response;
                })
                .collect(Collectors.toList());
    }
}
