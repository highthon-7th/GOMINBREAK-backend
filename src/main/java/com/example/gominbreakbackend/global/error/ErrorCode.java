package com.example.gominbreakbackend.global.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    USER_ID_ALREADY_EXISTS(409, "User Id Already Exists");

    private final int status;
    private final String message;

}
