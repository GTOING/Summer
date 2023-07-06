package com.summer.classdemo.controller;

import com.summer.classdemo.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/type")
public class TypeController {
    @Autowired
    private TypeService typeService;

    @RequestMapping("/getType")
    @ResponseBody
    public Map<String, Object> getType() {
        return typeService.getType();
    }
}
