package com.example.gominbreakbackend.domain.service;

import com.example.gominbreakbackend.domain.entity.Member;
import com.example.gominbreakbackend.domain.entity.repository.MemberRepository;
import com.example.gominbreakbackend.domain.presentation.dto.request.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final MemberRepository memberRepository;

    public void register(RegisterRequest request){
    }
}
