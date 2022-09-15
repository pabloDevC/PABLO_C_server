package com.kusitms.pablo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderList {

    @Id
    @GeneratedValue
    @Column(name = "order_list_pk")
    public Long orderListPK;

    @Column(name = "user_serial")
    public String userSerial;
}
