package com.example.gominbreakbackend.global.exception;

import com.example.gominbreakbackend.global.error.ErrorCode;
import com.example.gominbreakbackend.global.error.exception.GominException;

public class RefreshTokenNotFoundException extends GominException {

    public static GominException EXCEPTION =
            new RefreshTokenNotFoundException();

    private RefreshTokenNotFoundException(){
        super(ErrorCode.REFRESH_TOKEN_NOT_FOUND);
    }
}
