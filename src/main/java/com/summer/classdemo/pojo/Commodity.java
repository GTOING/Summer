package com.summer.classdemo.pojo;

import lombok.Data;

@Data
public class Commodity {
    private int id;
    private String commodityName;
    private String brand;
    private String type;
    private Double price;
    private String img_url;
}
