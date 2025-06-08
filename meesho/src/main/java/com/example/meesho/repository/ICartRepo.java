package com.example.meesho.repository;

import com.example.meesho.models.Cart;

public interface ICartRepo {

    Cart addProductToCart(int cartId, String productId, int quantity);

    Cart removeProductFromCart(int cartId, String productId);

    Cart fetchCart(int cartId);

    Cart clearCart(int cartId);

    Cart updateCart(int cartId, String productId, int quantity);

    Cart applyCoupon(int cartId, String couponCode);

    Cart removeCoupon(int cartId);

}
