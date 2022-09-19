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

        scanRepository.deleteById(delivery.getDeliveryPK());
    }
}
