package com.example.gominbreakbackend.domain.presentation.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class RegisterRequest {

    private String name;
    private String username;
    private String password;
    private String school;
}
