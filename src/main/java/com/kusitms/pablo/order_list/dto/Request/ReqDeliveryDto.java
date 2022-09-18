package com.kusitms.pablo.order_list.dto.Request;

import com.kusitms.pablo.entity.Delivery;
import com.kusitms.pablo.entity.OrderList;
import lombok.Data;

@Data
public class ReqDeliveryDto {

    public String adminSerial;

    public Long orderListPK;

    public Delivery toEntity(OrderList orderList) {
        return Delivery.builder()
                .adminSerial(this.adminSerial)
                .orderList(orderList)
                .build();
    }
}
