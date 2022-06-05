package com.example.prac02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @GetMapping("/welcome")
    public String getString() {
        return "Hello World";
    }
}
