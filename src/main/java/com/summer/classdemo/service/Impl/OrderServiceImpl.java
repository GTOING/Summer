package com.summer.classdemo.service.Impl;

import com.summer.classdemo.mapper.OrderMapper;
import com.summer.classdemo.pojo.Order;
import com.summer.classdemo.pojo.OrderVo;
import com.summer.classdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Map<String, Object> getOrderList(OrderVo orderVo) {
        List<Order> list = orderMapper.getOrderList(orderVo);
        Map<String, Object> map = new HashMap<>();
        map.put("data", list);
        return map;
    }
}
