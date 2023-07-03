package com.summer.classdemo.mapper;

import com.summer.classdemo.pojo.LoginUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginMapper {

    List<LoginUser> login(LoginUser user);
}
