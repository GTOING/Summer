package com.summer.classdemo.service;

import com.summer.classdemo.pojo.OrderVo;

import java.util.Map;

public interface OrderService {
    Map<String, Object> getOrderList(OrderVo orderVo);
}
