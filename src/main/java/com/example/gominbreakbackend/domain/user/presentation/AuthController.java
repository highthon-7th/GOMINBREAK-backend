package com.example.gominbreakbackend.domain.user.presentation;

import com.example.gominbreakbackend.domain.user.presentation.dto.request.LoginRequest;
import com.example.gominbreakbackend.domain.user.presentation.dto.request.RegisterRequest;
import com.example.gominbreakbackend.domain.user.presentation.dto.response.TokenResponse;
import com.example.gominbreakbackend.domain.user.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public void register(@RequestBody @Valid RegisterRequest request){
        authService.register(request);
    }

    @PostMapping("/login")
    public TokenResponse login(@RequestBody @Valid LoginRequest request){
        return authService.login(request);
    }

    @PutMapping("/reissue")
    public TokenResponse reissue(@RequestHeader(name = "x-refresh-token") String token){
        return authService.reissue(token);
    }
}
