package com.summer.classdemo.service.Impl;

import com.summer.classdemo.mapper.LoginMapper;
import com.summer.classdemo.pojo.LoginUser;
import com.summer.classdemo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Map<String, Object> login(LoginUser user) {
        Map<String, Object> map = new HashMap<>();
        List<LoginUser> userList = loginMapper.login(user);
        if (userList.size() > 0) {
            map.put("isLogin", true);
            map.put("msg", "登陆成功");
        } else {
            map.put("isLogin", false);
            map.put("msg", "用户名或密码错误，如没有账号，请注册！！");
        }
        return map;
    }

}