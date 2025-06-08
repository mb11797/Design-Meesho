package com.example.meesho.repository;

import com.example.meesho.models.Product;

import java.util.List;

public interface IProductRepo {

    Product addProduct(Product product);

    List<Product> fetchAllProducts();

    Product fetchProduct(String productId);
}
