package com.example.meesho.services;

import com.example.meesho.models.Cart;
import com.example.meesho.models.Coupon;
import com.example.meesho.models.Product;
import com.example.meesho.repository.ICartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CartService {

    @Autowired
    ICartRepo cartRepo;

    @Autowired
    CouponService couponService;

    @Autowired
    ProductService productService;

    public Cart addProductToCart(int cartId, String productId, int quantity) {
        return cartRepo.addProductToCart(cartId, productId, quantity);
    }

    public Cart applyCoupon(int cartId, String couponCode) {
        Coupon coupon = couponService.fetchCoupon(couponCode);
        Cart cart = cartRepo.fetchCart(cartId);

        double totalCost = 0;
        for (Map.Entry<String, Integer> entry : cart.getProducts().entrySet()) {
            Product product = productService.getProduct(entry.getKey());
            totalCost += entry.getValue() * product.getPrice();
        }

        if(totalCost < coupon.getMinPurchaseAmount()) {
            throw new RuntimeException("Minimum purchase amount not reached");
        }

        return cartRepo.applyCoupon(cartId, couponCode);
    }

}
