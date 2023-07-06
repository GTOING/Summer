package com.summer.classdemo.pojo;

import lombok.Data;

import java.sql.Date;

@Data
public class OrderVo {
    private int orderId;
    private Long orderNumber;
    private String orderName;
    private Date orderDate;
    private int orderQuantity;
}
