package com.kusitms.pablo.scan.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ReqScanDto {

    @NotBlank
    public String adminSerial;

    @NotBlank
    public String userSerial;

}
