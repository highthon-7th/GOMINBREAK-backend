package com.example.gominbreakbackend.global.exception;

import com.example.gominbreakbackend.global.error.ErrorCode;
import com.example.gominbreakbackend.global.error.exception.GominException;

public class InvalidPasswordException extends GominException {

    public static GominException EXCEPTION =
            new InvalidPasswordException();

    private InvalidPasswordException(){
        super(ErrorCode.INVALID_PASSWORD);
    }
}
