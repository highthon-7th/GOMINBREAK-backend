package com.example.gominbreakbackend.domain.user.presentation.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@NoArgsConstructor
public class LoginRequest {

    @NotBlank
    @Size(min = 1, max = 36, message = "아이디는 1자 이상 36자 이하입니다.")
    private String username;

    @NotBlank
    @Size(min = 8, max = 16, message = "비밀번호는 1자 이상 36자 이하입니다.")
    private String password;
}
