package com.summer.classdemo.controller;

import com.summer.classdemo.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Controller

public class IndexController {
    @Autowired
    UploadService uploadService;

    //    前端发送的请求
    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "Welcome to this fucking page!";
    }

    @RequestMapping("/")
    public String tologin() {
        return "Login";
    }

    @RequestMapping("/toIndex")
    public String toIndex() {
        return "index";
    }

    @RequestMapping("/toRegister")
    public String toRegister() {
        return "register";
    }

    @RequestMapping("/fileUpload")
    @ResponseBody
    public Map<String, Object> fileUpload(MultipartFile file) {
        return uploadService.fileUpload(file);
    }
}
