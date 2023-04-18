package com.ocpi.server.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserRoute {
    
    @GetMapping("/public")
    public String open() {
        return "Hello World!";
    }
    
    @GetMapping("/private")
    public String lock() {
        return "Secret Hello!";
    }
}
