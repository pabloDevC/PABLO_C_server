package com.kusitms.pablo.domain.delivery.service;

import com.kusitms.pablo.domain.delivery.repository.DeliveryRepository;
import com.kusitms.pablo.entity.Delivery;
import com.kusitms.pablo.entity.OrderList;
import com.kusitms.pablo.domain.delivery.dto.Request.ReqDeliveryDto;
import com.kusitms.pablo.domain.order_list.repository.OrderListRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@Slf4j
@RequiredArgsConstructor
@Service
public class DeliveryService {

    private final DeliveryRepository deliveryRepository;
    private final OrderListRepository orderListRepository;

    @Transactional
    public void 배달시작(ReqDeliveryDto reqDeliveryDto) {

        OrderList orderList = orderListRepository.findById(reqDeliveryDto.getOrderListPK()).orElseThrow(()-> new NoSuchElementException());
        // 배달 정보 생성
        Delivery delivery = reqDeliveryDto.toEntity(orderList);
        // 배달 정보 저장
        deliveryRepository.save(delivery);
    }
}
