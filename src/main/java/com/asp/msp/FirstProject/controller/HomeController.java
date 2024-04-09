package com.asp.msp.FirstProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }
    @GetMapping("/login")
    public String login() {
        return "index"; // Assumes index.html is located in src/main/resources/static
    }
}
