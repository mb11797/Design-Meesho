package com.example.meesho.controllers;

import com.example.meesho.models.Cart;
import com.example.meesho.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    CartService cartService;

    @PostMapping("/add")
    public Cart addProductToCart(@RequestBody int cartId, @RequestBody String productId, @RequestBody int quantity) {
        return cartService.addProductToCart(cartId, productId, quantity);
    }

    @PostMapping("/apply-coupon")
    public Cart applyCoupon(@RequestBody int cartId, @RequestBody String couponCode) {
        return cartService.applyCoupon(cartId, couponCode);
    }

}
