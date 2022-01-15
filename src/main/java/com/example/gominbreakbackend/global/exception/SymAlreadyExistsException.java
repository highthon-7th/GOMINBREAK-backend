package com.example.gominbreakbackend.global.exception;

import com.example.gominbreakbackend.global.error.ErrorCode;
import com.example.gominbreakbackend.global.error.exception.GominException;

public class SymAlreadyExistsException extends GominException {

    public static GominException EXCEPTION =
            new SymAlreadyExistsException();

    private SymAlreadyExistsException(){
        super(ErrorCode.SYM_ALREADY_EXISTS);
    }
}
