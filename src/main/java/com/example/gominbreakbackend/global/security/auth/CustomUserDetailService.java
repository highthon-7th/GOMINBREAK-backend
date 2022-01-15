package com.example.gominbreakbackend.global.security.auth;

import com.example.gominbreakbackend.domain.user.domain.repository.MemberRepository;
import com.example.gominbreakbackend.global.exception.UserNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailService {

    private final MemberRepository memberRepository;

    public UserDetails loadMemberByUsername(String username) throws UsernameNotFoundException{
        return memberRepository.findByUsername(username)
                .orElseThrow(() -> UserNotFoundException.EXCEPTION);
    }
}
