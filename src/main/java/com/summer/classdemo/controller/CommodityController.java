package com.summer.classdemo.controller;

import com.summer.classdemo.pojo.Commodity;
import com.summer.classdemo.pojo.CommodityVo;
import com.summer.classdemo.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("/toadd")
    public String toadd() {
        return "commodityAdd";
    }

    @RequestMapping("/commodityAdd")
    @ResponseBody
    public Map<String, Object> commodityAdd(Commodity commodity) {
        return commodityService.commodityAdd(commodity);
    }

    @RequestMapping("/toupd")
    public ModelAndView toupd(Integer id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("commodityUpd");
        modelAndView.addObject("id", id);
        return modelAndView;
    }

    @RequestMapping("/getCommodityById")
    @ResponseBody
    public Map<String, Object> getCommodityById(Integer id) {
        return commodityService.getCommodityById(id);
    }
}
