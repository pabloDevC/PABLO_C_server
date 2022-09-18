package com.kusitms.pablo.delivery.controller;

import com.kusitms.pablo.delivery.service.DeliveryService;
import com.kusitms.pablo.order_list.dto.Request.ReqDeliveryDto;
import com.kusitms.pablo.util.CommonResponse;
import com.kusitms.pablo.util.ResponseCode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class DeliveryController {

    private final DeliveryService deliveryService;

    /**
     * 배달 시작
     * [POST] /delivery
     * 작성자 : 장동호
     * 수정일 :
     */
    @PostMapping("/delivery")
    public CommonResponse<?> deliveryStart(@RequestBody ReqDeliveryDto reqDeliveryDto) {
        deliveryService.배달시작(reqDeliveryDto);

        return new CommonResponse<>(ResponseCode.SUCCESS);
    }
}
