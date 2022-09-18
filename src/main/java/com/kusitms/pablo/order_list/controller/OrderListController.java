package com.kusitms.pablo.order_list.controller;

import com.kusitms.pablo.order_list.dto.Request.ReqDeliveryDto;
import com.kusitms.pablo.order_list.dto.Response.RespOrderListDto;
import com.kusitms.pablo.order_list.service.OrderListService;
import com.kusitms.pablo.util.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class OrderListController {

    private final OrderListService orderListService;

    /**
     * 주문 내역
     * [GET] /order_list
     * 작성자 : 장동호
     * 수정일 : 2022-09-17
     */
    @GetMapping("/order_list")
    public CommonResponse<?> orderList() {
        // 주문 내역 가져오기
        RespOrderListDto respOrderListDto = orderListService.주문내역();
        return new CommonResponse<>(respOrderListDto);
    }


}
