package com.summer.classdemo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class IndexController {
    //    前端发送的请求
    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "Welcome to this fucking page!";
    }
}
