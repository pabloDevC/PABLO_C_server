package com.kusitms.pablo.domain.order_list.dto;

import com.kusitms.pablo.entity.OrderList;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RespOrderListDto {

    public List<OrderDto> orderDtoList;

    public RespOrderListDto entityToDto(List<OrderList> orderList) {

        orderDtoList = new ArrayList<>(orderList.size());

        for (OrderList m : orderList) {
            orderDtoList.add(new OrderDto(m));
        }

        RespOrderListDto respOrderListDto = new RespOrderListDto();
        respOrderListDto.setOrderDtoList(orderDtoList);
        return respOrderListDto;
    }
}