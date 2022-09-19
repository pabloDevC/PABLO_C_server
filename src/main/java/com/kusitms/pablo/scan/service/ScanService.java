package com.kusitms.pablo.scan.service;

import com.kusitms.pablo.entity.Delivery;
import com.kusitms.pablo.order_list.repository.OrderListRepository;
import com.kusitms.pablo.scan.dto.ReqScanDto;
import com.kusitms.pablo.scan.repository.ScanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScanService {

    private final ScanRepository scanRepository;
    private final OrderListRepository orderListRepository;


    public void 배달수령(ReqScanDto reqScanDto){

        Delivery delivery = scanRepository.findByUserSerialAndAdminSerial(reqScanDto.getUserSerial(), reqScanDto.getAdminSerial());

        //연관관계때문에 cascade불가능 / 주문상품을 안건드리고 orderlist delete가 불가능
//        orderListRepository.deleteById(delivery.getOrderList().getOrderListPK());

        scanRepository.delete(delivery);

    }
}
