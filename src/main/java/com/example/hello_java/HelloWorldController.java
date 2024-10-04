package com.example.hello_java;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
@RestController

public class HelloWorldController {
    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World";
    }
}