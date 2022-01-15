package com.example.gominbreakbackend.global.exception;

import com.example.gominbreakbackend.global.error.ErrorCode;
import com.example.gominbreakbackend.global.error.exception.GominException;

public class PostNotFoundException extends GominException {

    public static GominException EXCEPTION =
            new PostNotFoundException();

    private PostNotFoundException(){
        super(ErrorCode.POST_NOT_FOUND);
    }
}
