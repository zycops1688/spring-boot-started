package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @GetMapping("/hello-world")
    public String demo (){
        return "Hello, World";
    }
}
