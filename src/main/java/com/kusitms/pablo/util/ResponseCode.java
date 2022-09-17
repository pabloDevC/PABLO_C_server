package com.kusitms.pablo.util;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ResponseCode {
    // Success
    SUCCESS(true, HttpStatus.OK.value(), "요청에 성공하였습니다.");

    // Common


    private Boolean isSuccess;
    private int code;
    private String message;

    ResponseCode(Boolean isSuccess, int code, String message) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
    }
}
