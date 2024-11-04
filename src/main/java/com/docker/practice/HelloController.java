package com.docker.practice;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String getHello() {
        return "Hello";
    }
}
