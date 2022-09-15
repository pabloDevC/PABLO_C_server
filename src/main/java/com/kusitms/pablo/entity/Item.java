package com.kusitms.pablo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

    @Id @GeneratedValue
    @Column(name = "item_pk")
    public Long itemPK;

    @Column(name = "product_name")
    public String productName;
}
