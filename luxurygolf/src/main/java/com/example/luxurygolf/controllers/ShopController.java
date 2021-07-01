package com.example.luxurygolf.controllers;


import com.example.luxurygolf.domain.User;
import com.example.luxurygolf.services.ProductSV;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private final ProductSV productSV;

    public ShopController(ProductSV productSV) {
        this.productSV = productSV;
    }

    @GetMapping
    public String shop(Model model){
        model.addAttribute("products",productSV.findAll());
        return "Shop";
    }

    @PostMapping("/cart")
    public String buy(){
        return "home";
    }


}
