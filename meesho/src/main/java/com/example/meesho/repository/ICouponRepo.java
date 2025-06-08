package com.example.meesho.repository;

import com.example.meesho.models.Coupon;
import java.util.List;

public interface ICouponRepo {

    Coupon createCoupon(Coupon coupon);

    Coupon fetchCoupon(String couponCode);

    List<Coupon> fetchAllCoupons();

}
