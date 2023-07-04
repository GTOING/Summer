package com.summer.classdemo.controller;

import com.summer.classdemo.pojo.CommodityVo;
import com.summer.classdemo.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/commodity")
public class CommodityController {
    @Autowired
    private CommodityService commodityService;

    @RequestMapping("/getCommodityList")
    @ResponseBody
    public Map<String, Object> getCommodityList(CommodityVo commodityVo) {

        return commodityService.getCommodityList(commodityVo);
    }
}
