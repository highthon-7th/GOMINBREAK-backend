package com.example.gominbreakbackend.global.error.exception;

import com.example.gominbreakbackend.global.error.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class GominBreakException extends RuntimeException{
    private final ErrorCode errorCode;
}
