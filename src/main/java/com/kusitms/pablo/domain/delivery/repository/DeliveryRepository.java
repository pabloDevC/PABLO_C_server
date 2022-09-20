package com.kusitms.pablo.domain.delivery.repository;

import com.kusitms.pablo.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}
