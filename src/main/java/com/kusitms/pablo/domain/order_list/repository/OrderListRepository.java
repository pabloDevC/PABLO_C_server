package com.kusitms.pablo.domain.order_list.repository;

import com.kusitms.pablo.entity.OrderList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderListRepository extends JpaRepository<OrderList, Long> {
}
