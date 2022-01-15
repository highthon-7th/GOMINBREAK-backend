package com.example.gominbreakbackend.global.exception;

import com.example.gominbreakbackend.global.error.ErrorCode;
import com.example.gominbreakbackend.global.error.exception.GominException;

public class AuthenticationNotFoundException extends GominException {

    public static GominException EXCEPTION =
            new AuthenticationNotFoundException();

    private AuthenticationNotFoundException(){
        super(ErrorCode.AUTHENTICATION_NOT_FOUND);
    }
}
