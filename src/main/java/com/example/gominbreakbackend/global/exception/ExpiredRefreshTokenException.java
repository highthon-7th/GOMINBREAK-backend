package com.example.gominbreakbackend.global.exception;

import com.example.gominbreakbackend.global.error.ErrorCode;
import com.example.gominbreakbackend.global.error.exception.GominException;

public class ExpiredRefreshTokenException extends GominException {
    public static GominException EXCEPTION =
            new ExpiredRefreshTokenException();

    private ExpiredRefreshTokenException(){
        super(ErrorCode.EXPIRED_REFRESH_TOKEN);
    }
}
