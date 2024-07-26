package com.bravor.Bravo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class homeController {
    
    @GetMapping("/")
    public String home() {
        return "Hello, Spring Boot! this is my first aplicarion by Leider Andres Bravo";
    }
    
}
