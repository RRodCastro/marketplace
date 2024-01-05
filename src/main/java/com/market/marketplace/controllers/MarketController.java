package com.market.marketplace.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")

public class MarketController {


    @GetMapping("")
    public String helloWorld() {
        return "Hello world! 🚀";
    }
}
