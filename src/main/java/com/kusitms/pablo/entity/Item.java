package com.kusitms.pablo.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
public class Item {

    @Id @GeneratedValue
    @Column(name = "item_pk")
    public Long itemPK;

    @Column(nullable = false, name = "product_name")
    public String productName;
}
