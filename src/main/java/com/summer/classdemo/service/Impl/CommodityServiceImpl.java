package com.summer.classdemo.service.Impl;

import com.summer.classdemo.mapper.CommodityMapper;
import com.summer.classdemo.pojo.Commodity;
import com.summer.classdemo.pojo.CommodityVo;
import com.summer.classdemo.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    private CommodityMapper commodityMapper;

    @Override
    public Map<String, Object> getCommodityList(CommodityVo commodityVo) {
        List<Commodity> list = commodityMapper.getCommodityList(commodityVo);
        Map<String, Object> map = new HashMap<>();
        map.put("data", list);
        return map;
    }
}
