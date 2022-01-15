package com.example.gominbreakbackend.global.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    INCORRECT_TOKEN(400, "Incorrect Token"),
    INVALID_TOKEN(401, "Invalid Token"),
    EXPIRED_ACCESS_TOKEN(401, "Expired Access Token"),
    EXPIRED_REFRESH_TOKEN(401, "Expired Refresh Token"),
    REFRESH_TOKEN_NOT_FOUND(404, "Refresh Token Not Found"),

    MEMBER_ID_ALREADY_EXISTS(409, "Member Id Already Exists"),
    MEMBER_NAME_ALREADY_EXISTS(409, "Member Name Already Exists"),
    MEMBER_NOT_FOUND(404, "User Not Found"),
    MEMBER_USERNAME_ALREADY_EXISTS(409, "Member Already Exists"),
    INVALID_PASSWORD(401, "Invalid Password"),

    POST_NOT_FOUND(404, "Post Not Found");

    private final int status;
    private final String message;

}
