package com.example.meesho.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Coupon {

    String code;
    DiscountType discountType;
    double discountValue;
    double minPurchaseAmount;
    LocalDateTime expiryDate;
}
