package com.kusitms.pablo.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "order_item_pk")
    public Long orderItemPK;

    @Column(nullable = false, name = "product_count")
    public Long productCount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_list_pk")
    public OrderList orderList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_pk")
    public Item item;
}
