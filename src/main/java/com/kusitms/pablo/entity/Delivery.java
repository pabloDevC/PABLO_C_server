package com.kusitms.pablo.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_pk")
    public Long deliveryPK;

    @Column(nullable = false, unique = true, name = "admin_serial")
    public String adminSerial;

    @Column(nullable = false, name = "user_serial")
    public String userSerial;

    @OneToOne
    @JoinColumn(name="order_list_pk")
    public OrderList orderList;
}
