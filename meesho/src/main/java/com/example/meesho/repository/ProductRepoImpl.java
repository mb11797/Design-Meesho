package com.example.meesho.repository;


import com.example.meesho.models.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepoImpl implements IProductRepo{

    Map<String, Product> allProducts = new HashMap<>();

    @Override
    public synchronized Product addProduct(Product product) {
        allProducts.put(product.getId(), product);
        return product;
    }

    @Override
    public List<Product> fetchAllProducts() {
        return new ArrayList<>(allProducts.values());
    }

    @Override
    public Product fetchProduct(String productId) {
        return allProducts.get(productId);
    }
}
