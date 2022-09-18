package com.kusitms.pablo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_pk")
    public Long deliveryPK;

    @Column(name = "admin_serial")
    public String adminSerial;

    @OneToOne
    @JoinColumn(name = "order_list_pk")
    public OrderList orderList;
}
