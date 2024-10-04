package com.example.hello_java;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;
import java.time.LocalDateTime;
@RestController

public class HelloWorldController {
    @GetMapping("now")
    public String now(){
        LocalDateTime now = LocalDateTime.now();
        return now.toString();
    }
    @GetMapping ("/time")
    public String time(){
        LocalTime now = LocalTime.now();
        return now.toString();
    }
    @GetMapping("/month")
    public String month(){
        LocalDateTime now = LocalDateTime.now();
        int month = now.getMonthValue();
        return String.valueOf(month);
    }
    @GetMapping("/api")
    public String numberString(@RequestParam int a) {
        StringBuilder c = new StringBuilder();

        for (int i = 1; i <= a; i++) {
            c.append(i);
            if (i < a) {
                c.append(", ");
            }
        }
        return c.toString();
    }
    @GetMapping("/random_number")
    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(500) + 1;
    }
    @GetMapping ("fibi")
    public int fibi(@RequestParam int a) {
        if(a == 1 || a == 2) {
            return 1;
        }
        int[] fib = new int[a];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < a; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[a-1];
    }
    @GetMapping("/reverse/{string}")
    public String reverse(@PathVariable String string) {
        return new StringBuilder(string).reverse().toString();

    }



}