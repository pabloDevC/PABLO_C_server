package com.kusitms.pablo.order_list.service;

import com.kusitms.pablo.entity.OrderList;
import com.kusitms.pablo.order_list.dto.Response.RespOrderListDto;
import com.kusitms.pablo.order_list.repository.OrderListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderListService {

    private final OrderListRepository orderListRepository;

    @Transactional(readOnly = true)
    public RespOrderListDto 주문내역() {
        // 주문 내역 가져오기
        List<OrderList> orderList = orderListRepository.findAll();

        // Dto 생성 후, 가져온 주문 내역들 Dto 변환
        RespOrderListDto respOrderListDto = new RespOrderListDto();
        respOrderListDto.toDto(orderList);

        // Dto 변환된 주문 내역 반환
        return respOrderListDto;
    }


}
