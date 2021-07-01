package com.example.luxurygolf.services;

import com.example.luxurygolf.domain.Product;

import java.util.List;

public interface ProductSV {
    List<Product> findAll();
    void save(Product p);
}
