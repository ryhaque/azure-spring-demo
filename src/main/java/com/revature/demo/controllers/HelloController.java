package com.revature.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello(){
        return "Hello From Spring Boot";
    }
    @GetMapping("/fruit")
    public String fruit(){
        return "Orange Apple Kiwi";
    }
}
