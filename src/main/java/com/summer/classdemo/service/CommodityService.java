package com.summer.classdemo.service;

import com.summer.classdemo.pojo.CommodityVo;

import java.util.Map;

public interface CommodityService {
    Map<String, Object> getCommodityList(CommodityVo commodityVo);
}
