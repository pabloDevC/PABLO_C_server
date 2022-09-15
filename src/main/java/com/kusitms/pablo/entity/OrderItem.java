package com.kusitms.pablo.entity;

import javax.persistence.*;

@Entity
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "order_item_pk")
    public Long orderItemPK;

    @Column(name = "product_count")
    public Long productCount;

    @ManyToOne
    @JoinColumn(name = "order_list_pk")
    public OrderList orderList;

    @ManyToOne
    @JoinColumn(name = "item_pk")
    public Item item;
}
