package com.kusitms.pablo.domain.scan.controller;

import com.kusitms.pablo.domain.scan.dto.ReqScanDto;
import com.kusitms.pablo.domain.scan.service.ScanService;
import com.kusitms.pablo.util.CommonResponse;
import com.kusitms.pablo.util.ResponseCode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
public class ScanController {

    private final ScanService scanService;

    /**
     * qr코드스캔
     * [GET] /scan
     * 작성자 : 고승원
     * 수정일 : 2022-09-19
     */
    @PostMapping("/scan")
    public CommonResponse<?> scan(@RequestBody ReqScanDto reqScanDto) {
        scanService.배달수령(reqScanDto);

        return new CommonResponse<>(ResponseCode.SUCCESS);
    }

    
    //userSerial 이 delivery 테이블에 없을 시 예외
    @ExceptionHandler(NullPointerException.class)
    public CommonResponse<?> handleNullPointerException(NullPointerException exception){
        return new CommonResponse<>(ResponseCode.NOT_FOUND_DELIVERY);
    }
}
