package com.kusitms.pablo.scan.repository;

import com.kusitms.pablo.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScanRepository extends JpaRepository<Delivery,Long> {

    Delivery findByUserSerialAndAdminSerial(String userSerial, String adminSerial);
}
