package com.example.gominbreakbackend.global.exception;

import com.example.gominbreakbackend.global.error.ErrorCode;
import com.example.gominbreakbackend.global.error.exception.GominException;

public class UserIdAlreadyException extends GominException {

    public static GominException EXCEPTION =
            new UserIdAlreadyException();

    private UserIdAlreadyException(){
        super(ErrorCode.USER_ID_ALREADY_EXISTS);
    }
}
