package com.example.gominbreakbackend.global.exception;

import com.example.gominbreakbackend.domain.comment.domain.Comment;
import com.example.gominbreakbackend.global.error.ErrorCode;
import com.example.gominbreakbackend.global.error.exception.GominException;

public class CommentNotFoundException extends GominException {

    public static GominException EXCEPTION =
            new CommentNotFoundException();

    private CommentNotFoundException(){
        super(ErrorCode.COMMENT_NOT_FOUND);
    }
}
