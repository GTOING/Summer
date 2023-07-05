package com.summer.classdemo.mapper;

import com.summer.classdemo.pojo.Commodity;
import com.summer.classdemo.pojo.CommodityVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommodityMapper {

    List<Commodity> getCommodityList(CommodityVo commodityVo);

    int commodityAdd(Commodity commodity);

    Commodity getCommodityById(Integer id);

    void del(Integer id);

    int commodityUpd(Commodity commodity);
}
