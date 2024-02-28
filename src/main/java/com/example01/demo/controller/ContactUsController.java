package com.example01.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactUsController {

    @GetMapping("/contactus")
    public String welcome(){
        return "ContactUs";
    }
}
