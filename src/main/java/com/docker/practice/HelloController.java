package com.docker.practice;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    private final String uuid = UUID.randomUUID().toString();

    @GetMapping("/hello")
    public String getHello() {
        return "Hello, My UUID is "+uuid;
    }
}
