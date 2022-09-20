package com.kusitms.pablo.domain.scan.dto;

import com.kusitms.pablo.entity.Delivery;
import com.kusitms.pablo.entity.OrderList;
import lombok.Data;

@Data
public class DeliveryDto {
    public long deliveryPK;
    public String adminSerial;
    public String userSerial;
    public OrderList orderList;

    public DeliveryDto(Delivery delivery) {
        this.deliveryPK = delivery.getDeliveryPK();
        this.adminSerial = delivery.getAdminSerial();
        this.userSerial = delivery.getUserSerial();
        this.orderList = delivery.getOrderList();
    }

}
