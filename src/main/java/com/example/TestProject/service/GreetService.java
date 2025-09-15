package com.example.TestProject.service;

import com.example.TestProject.helper.MessageGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetService {

    @GetMapping("/greet")
    public String greet() {
        return new MessageGenerator().getMessage();
    }
}