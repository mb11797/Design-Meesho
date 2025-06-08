package com.example.meesho.repository;

import com.example.meesho.models.Cart;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CartRepoImpl implements ICartRepo{

    Map<Integer, Cart> cartMap = new HashMap<>();

    @Override
    public Cart addProductToCart(int cartId, String productId, int quantity) {
        Cart cart = new Cart();
        cart.setId(cartId);
        cart.getProducts().put(productId, quantity);
        cartMap.put(cartId, cart);
        return cart;
    }

    @Override
    public Cart removeProductFromCart(int cartId, String productId) {
        cartMap.get(cartId).getProducts().remove(productId);
        return cartMap.get(cartId);
    }

    @Override
    public Cart fetchCart(int cartId) {
        return cartMap.get(cartId);
    }

    @Override
    public Cart clearCart(int cartId) {
        cartMap.remove(cartId);
        return null;
    }

    @Override
    public Cart updateCart(int cartId, String productId, int quantity) {
        cartMap.get(cartId).getProducts().put(productId, quantity);
        return cartMap.get(cartId);
    }

    @Override
    public Cart applyCoupon(int cartId, String couponCode) {
        cartMap.get(cartId).setCouponCode(couponCode);
        return cartMap.get(cartId);
    }

    @Override
    public Cart removeCoupon(int cartId) {
        cartMap.get(cartId).setCouponCode(null);
        return cartMap.get(cartId);
    }
}
