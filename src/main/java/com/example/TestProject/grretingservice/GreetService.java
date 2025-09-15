package com.example.TestProject.grretingservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetService {

    @GetMapping("/greet")
    public String greet() {
        return "Hello India";
    }
}