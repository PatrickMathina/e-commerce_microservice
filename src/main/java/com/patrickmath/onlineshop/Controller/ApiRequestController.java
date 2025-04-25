package com.patrickmath.onlineshop.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRequestController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Online Shop!";
    }
}




