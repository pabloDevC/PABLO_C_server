package com.kusitms.pablo.entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
public class OrderList {

    @Id
    @GeneratedValue
    @Column(name = "order_list_pk")
    public Long orderListPK;

    @Column(nullable = false, name = "user_serial")
    public String userSerial;

    @OneToMany(mappedBy = "orderList")
    public List<OrderItem> orderItemList;
}
