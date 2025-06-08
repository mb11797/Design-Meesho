package com.example.meesho.models;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Cart {

    int id;
    Map<String, Integer> products;
    String couponCode;

}
