package com.kusitms.pablo.order_list.dto.Response;

import com.kusitms.pablo.entity.OrderItem;
import com.kusitms.pablo.entity.OrderList;
import com.kusitms.pablo.order_list.dto.Response.ItemDto;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class OrderDto {

    public Long orderPK;

    public List<ItemDto> itemList;

    public OrderDto(OrderList orderList) {
        // 사용자 주문 번호 설정
        orderPK = orderList.getOrderListPK();

        List<OrderItem> orderItemList = orderList.getOrderItemList();

        itemList = new ArrayList<>(orderItemList.size());

        for (OrderItem m : orderItemList) {
            itemList.add(new ItemDto(m));
        }
    }
}
