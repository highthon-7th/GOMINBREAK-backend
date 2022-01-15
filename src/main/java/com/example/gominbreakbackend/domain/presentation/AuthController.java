package com.example.gominbreakbackend.domain.presentation;

import com.example.gominbreakbackend.domain.presentation.dto.request.RegisterRequest;
import com.example.gominbreakbackend.domain.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public void register(@RequestBody @Valid RegisterRequest request){
        authService.register(request);
    }
}
