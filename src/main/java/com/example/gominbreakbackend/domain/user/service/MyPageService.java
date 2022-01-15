package com.example.gominbreakbackend.domain.user.service;

import com.example.gominbreakbackend.domain.post.domain.repository.PostRepository;
import com.example.gominbreakbackend.domain.user.domain.repository.MemberRepository;
import com.example.gominbreakbackend.domain.user.facade.MemberFacade;
import com.example.gominbreakbackend.domain.user.presentation.dto.response.MemberInfoResponse;
import com.example.gominbreakbackend.domain.user.presentation.dto.response.MyPageResponse;
import com.example.gominbreakbackend.global.exception.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MyPageService {

    private final MemberRepository memberRepository;
    private final PostRepository postRepository;

    public List<MyPageResponse> myPage(){
        return postRepository.findPostByMemberId(MemberFacade.getMemberId())
                .stream()
                .map(post -> {
                    MyPageResponse response = MyPageResponse.builder()
                            .title(post.getTitle())
                            .content(post.getContent())
                            .build();
                    return response;
                })
                .collect(Collectors.toList());
    }

    public MemberInfoResponse memberInfo(){
        return memberRepository.findById(MemberFacade.getMemberId())
                .map(member -> {
                    MemberInfoResponse response = MemberInfoResponse.builder()
                            .name(member.getName())
                            .commentCounts(member.)
                            .symCounts(member.getSymCounts())
                            .schoolName(member.getSchool())
                            .build();
                    return response;
                })
                .orElseThrow(() -> UserNotFoundException.EXCEPTION);
    }
}
