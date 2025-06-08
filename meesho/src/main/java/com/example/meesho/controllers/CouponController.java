package com.example.meesho.controllers;

import com.example.meesho.models.Coupon;
import com.example.meesho.services.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/coupons")
public class CouponController {

    @Autowired
    CouponService couponService;

    @PostMapping("/add")
    public Coupon createCoupon(@RequestBody Coupon coupon) {
        return couponService.createCoupon(coupon);
    }

    @GetMapping("/all")
    public Coupon fetchCoupon(@RequestBody String couponCode) {
        return couponService.fetchCoupon(couponCode);
    }

}
