package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class NewRestController {

    @GetMapping("/api/v1/user")
    public String getUserNumber() {
        return "82240941";
    }
}