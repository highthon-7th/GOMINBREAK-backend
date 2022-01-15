package com.example.gominbreakbackend.global.exception;

import com.example.gominbreakbackend.global.error.ErrorCode;
import com.example.gominbreakbackend.global.error.exception.GominException;

public class UserIdAlreadyExistsException extends GominException {

    public static GominException EXCEPTION =
            new UserIdAlreadyExistsException();

    private UserIdAlreadyExistsException(){
        super(ErrorCode.MEMBER_ID_ALREADY_EXISTS);
    }
}
