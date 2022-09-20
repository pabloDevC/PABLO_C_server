package com.kusitms.pablo.domain.delivery.dto.Request;

import com.kusitms.pablo.entity.Delivery;
import com.kusitms.pablo.entity.OrderList;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ReqDeliveryDto {

    @NotBlank
    public String adminSerial;

    @NotNull
    public Long orderListPK;

    public Delivery toEntity(OrderList orderList) {
        return Delivery.builder()
                .adminSerial(this.adminSerial)
                .userSerial(orderList.getUserSerial())
                .orderList(orderList)
                .build();
    }
}
