package com.summer.classdemo.controller;

import com.summer.classdemo.pojo.CommodityVo;
import com.summer.classdemo.pojo.OrderVo;
import com.summer.classdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping("/getOrderList")
    @ResponseBody
    public Map<String, Object> getOrderList(OrderVo orderVo) {
        return orderService.getOrderList(orderVo);
    }
}
