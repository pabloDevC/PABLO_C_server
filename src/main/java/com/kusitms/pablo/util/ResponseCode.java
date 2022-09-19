package com.kusitms.pablo.util;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ResponseCode {
    // Success
    SUCCESS(true, HttpStatus.OK.value(), "요청에 성공하였습니다."),

    // Delivery
    // 요청온 orderListPK 에 해당하는 OrderList 가 db에 존재하지 않을 때.
    NOT_FOUNT_ORDER(false, HttpStatus.NOT_FOUND.value(), "존재하지 않는 주문입니다"),
    // 유효하지 않은 요청값이 들어왔을 때.
    INVALID_REQUEST(false, HttpStatus.BAD_REQUEST.value(), "잘못된 요청입니다."),
    // 이미 배달이 배정된 관리자 시리얼 번호로 배달을 배정하려할 때.
    DUPLICATE_REQUEST(false, HttpStatus.BAD_REQUEST.value(), "이미 배달중인 관리자 시리얼 번호 입니다.");



    private Boolean isSuccess;
    private int code;
    private String message;

    ResponseCode(Boolean isSuccess, int code, String message) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
    }
}
