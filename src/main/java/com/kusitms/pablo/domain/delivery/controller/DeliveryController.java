package com.kusitms.pablo.domain.delivery.controller;

import com.kusitms.pablo.domain.delivery.service.DeliveryService;
import com.kusitms.pablo.domain.delivery.dto.Request.ReqDeliveryDto;
import com.kusitms.pablo.util.CommonResponse;
import com.kusitms.pablo.util.ResponseCode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.NoSuchElementException;

@Slf4j
@RequiredArgsConstructor
@RestController
public class DeliveryController {

    private final DeliveryService deliveryService;

    /**
     * 배달 시작
     * [POST] /delivery
     * 작성자 : 장동호
     * 수정일 : 2022-09-18
     */
    @PostMapping("/delivery")
    public CommonResponse<?> deliveryStart(@RequestBody @Valid ReqDeliveryDto reqDeliveryDto) {
        deliveryService.배달시작(reqDeliveryDto);

        return new CommonResponse<>(ResponseCode.SUCCESS);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public CommonResponse<?> handleNoSuchElementException(NoSuchElementException exception) {
        return new CommonResponse<>(ResponseCode.NOT_FOUNT_ORDER);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public CommonResponse<?> handleHttpMessageNotReadableException(HttpMessageNotReadableException exception) {
        return new CommonResponse<>(ResponseCode.INVALID_REQUEST);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public CommonResponse<?> handleDataIntegrityViolationException(DataIntegrityViolationException exception) {
        return new CommonResponse<>(ResponseCode.DUPLICATE_REQUEST);
    }
}
