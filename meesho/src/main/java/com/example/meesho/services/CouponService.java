package com.example.meesho.services;

import com.example.meesho.models.Coupon;
import com.example.meesho.repository.ICouponRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponService {

    @Autowired
    private ICouponRepo couponRepo;

    public Coupon createCoupon(Coupon coupon) {
        return couponRepo.createCoupon(coupon);
    }

    public Coupon fetchCoupon(String couponCode) {
        return couponRepo.fetchCoupon(couponCode);
    }
}
