package com.summer.classdemo.mapper;

import com.summer.classdemo.pojo.Order;
import com.summer.classdemo.pojo.OrderVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<Order> getOrderList(OrderVo orderVo);
}
