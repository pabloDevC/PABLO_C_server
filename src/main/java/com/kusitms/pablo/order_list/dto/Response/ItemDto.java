package com.kusitms.pablo.order_list.dto.Response;

import com.kusitms.pablo.entity.OrderItem;
import lombok.Data;

@Data
public class ItemDto {

    public String productName;

    public Long productCount;

    public ItemDto(OrderItem orderItem) {
        // 상품 이름 설정
        this.productName = orderItem.getItem().getProductName();
        // 상품 개수 설정
        this.productCount = orderItem.getProductCount();
    }
}
