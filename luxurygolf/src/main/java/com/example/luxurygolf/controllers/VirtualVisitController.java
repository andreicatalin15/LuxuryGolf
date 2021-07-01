package com.example.luxurygolf.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/virtual")
public class VirtualVisitController {

    @GetMapping
    public String virtual(){
        return "virtualvisit";
    }
}
