package com.example.luxurygolf.services;

import com.example.luxurygolf.domain.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductSVImpl implements ProductSV{

    List<Product> products = new ArrayList(List.of(
       new Product("Crosa golf",1000)

    ));


    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product p) {
        products.add(p);
    }
}
