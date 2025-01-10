package com.demo.SampleLibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/homepage")
    public String HomePage(){
        return "Welcome to Home Page!!";
    }
}
