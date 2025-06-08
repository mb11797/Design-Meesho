package com.example.meesho.repository;

import com.example.meesho.models.Coupon;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CouponRepoImpl implements ICouponRepo {

    Map<String, Coupon> allCoupons = new HashMap<>();

    @Override
    public Coupon createCoupon(Coupon coupon) {
        allCoupons.put(coupon.getCode(), coupon);
        return coupon;
    }

    @Override
    public Coupon fetchCoupon(String couponCode) {
        return allCoupons.get(couponCode);
    }

    @Override
    public List<Coupon> fetchAllCoupons() {
        return new ArrayList<>(allCoupons.values());
    }


}
