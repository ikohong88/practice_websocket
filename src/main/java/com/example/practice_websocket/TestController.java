package com.example.practice_websocket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @GetMapping("/")
    public String index() {
        return "Hello Jenkins!";
    }
}
