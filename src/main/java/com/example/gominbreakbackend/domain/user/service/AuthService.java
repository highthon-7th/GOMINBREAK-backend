package com.example.gominbreakbackend.domain.user.service;

import com.example.gominbreakbackend.domain.user.domain.Member;
import com.example.gominbreakbackend.domain.user.domain.RefreshToken;
import com.example.gominbreakbackend.domain.user.domain.repository.MemberRepository;
import com.example.gominbreakbackend.domain.user.domain.repository.RefreshTokenRepository;
import com.example.gominbreakbackend.domain.user.domain.types.Role;
import com.example.gominbreakbackend.domain.user.presentation.dto.request.LoginRequest;
import com.example.gominbreakbackend.domain.user.presentation.dto.request.RegisterRequest;
import com.example.gominbreakbackend.domain.user.presentation.dto.response.TokenResponse;
import com.example.gominbreakbackend.global.exception.*;
import com.example.gominbreakbackend.global.security.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;
    private final RefreshTokenRepository refreshTokenRepository;
    private final JwtTokenProvider jwtTokenProvider;

    @Value("${jwt.exp.refresh}")
    private Long REFRESH_TOKEN_VALID_TIME;

    public void register(RegisterRequest request){
        if (memberRepository.findByUsername(request.getUsername()).isPresent())
            throw UserIdAlreadyExistsException.EXCEPTION;

        memberRepository.save(Member.builder()
                        .username(request.getUsername())
                        .password(passwordEncoder.encode(request.getPassword()))
                        .name(request.getName())
                        .everyLikeCounts(0)
                        .school(request.getSchool())
                        .role(Role.ROLE_STUDENT)
                        .build());
    }

    public TokenResponse login(LoginRequest request){

        Member member = memberRepository.findByUsername(request.getUsername())
                .orElseThrow(() -> UserNotFoundException.EXCEPTION);
        if (!passwordEncoder.matches(request.getPassword(), member.getPassword()))
            throw InvalidPasswordException.EXCEPTION;
        return createToken(request.getUsername());
    }

    public TokenResponse createToken(String name) {
        String accessToken = jwtTokenProvider.createJwtAccessToken(name);
        String refreshToken = jwtTokenProvider.createJwtRefreshToken(name);

        refreshTokenRepository.save(
                RefreshToken.builder()
                        .username(name)
                        .refreshToken(refreshToken)
                        .refreshExpiration(REFRESH_TOKEN_VALID_TIME)
                        .build());

        return new TokenResponse(accessToken, refreshToken);
    }

    public TokenResponse reissue(String refreshToken) {
        if (!jwtTokenProvider.isRefreshToken(refreshToken)) {
            throw InvalidTokenException.EXCEPTION;
        }

        RefreshToken newRefreshToken = refreshTokenRepository.findByRefreshToken(refreshToken)
                .map(refresh -> refreshTokenRepository.save(
                        refresh.update(REFRESH_TOKEN_VALID_TIME)
                ))
                .orElseThrow(() -> RefreshTokenNotFoundException.EXCEPTION);

        return new TokenResponse(jwtTokenProvider.createJwtAccessToken(newRefreshToken.getUsername()), refreshToken);
    }
}
