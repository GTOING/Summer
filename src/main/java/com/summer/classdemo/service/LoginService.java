package com.summer.classdemo.service;

import com.summer.classdemo.pojo.LoginUser;

import java.util.Map;

public interface LoginService {

    Map<String, Object> login(LoginUser user);

    Map<String, Object> register(LoginUser user);
}
