package com.example.me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MeApplication {

    @GetMapping
    public String home() {
        return "I'm not Racist.";
    }
    public static void main(String[] args) {
        SpringApplication.run(MeApplication.class, args);
    }

}
