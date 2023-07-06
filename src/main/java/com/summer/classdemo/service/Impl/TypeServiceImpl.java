package com.summer.classdemo.service.Impl;

import com.summer.classdemo.mapper.TypeMapper;
import com.summer.classdemo.pojo.TbType;
import com.summer.classdemo.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeMapper typeMapper;

    @Override
    public Map<String, Object> getType() {
        HashMap<String, Object> map = new HashMap<>();
        List<TbType> types = typeMapper.getType();
        map.put("data", types);
        return map;
    }
}
