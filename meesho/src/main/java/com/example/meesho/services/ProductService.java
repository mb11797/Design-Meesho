package com.example.meesho.services;

import com.example.meesho.models.Product;
import com.example.meesho.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private IProductRepo productRepo;

    public Product addProduct(Product product) {
        return productRepo.addProduct(product);
    }

    public List<Product> getAllProducts() {
        return productRepo.fetchAllProducts();
    }

    public Product getProduct(String productId) {
        return productRepo.fetchProduct(productId);
    }
}
