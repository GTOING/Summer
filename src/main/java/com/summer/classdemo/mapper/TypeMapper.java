package com.summer.classdemo.mapper;

import com.summer.classdemo.pojo.TbType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TypeMapper {

    List<TbType> getType();
}
