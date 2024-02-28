package com.example01.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cardController {

    @GetMapping("/card")
    public String welcome(){
        return "card";
    }
}
