package com.example.gominbreakbackend.global.exception;

import com.example.gominbreakbackend.global.error.ErrorCode;
import com.example.gominbreakbackend.global.error.exception.GominException;

public class IncorrectTokenException extends GominException {

    public static GominException EXCEPTION =
            new IncorrectTokenException();

    private IncorrectTokenException(){
        super(ErrorCode.INCORRECT_TOKEN);
    }
}
