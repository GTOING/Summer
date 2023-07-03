package com.summer.classdemo.controller;

import com.summer.classdemo.pojo.LoginUser;
import com.summer.classdemo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class LoginController {
    //    注入LoginService类
    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    @ResponseBody
    public Map<String, Object> login(LoginUser user) {

        return loginService.login(user);
    }
}
