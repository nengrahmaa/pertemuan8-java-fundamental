package com.example.mvc.service;

import java.util.*;
import org.springframework.stereotype.Service;

import com.example.mvc.model.Product;

@Service
public class ProductService {
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, "Produk A", 10.0));
        products.add(new Product(2L, "Produk B", 20.0));
        products.add(new Product(3L, "Produk C", 30.0));
        return products;
    }
}