package com.example.azuretest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureTestApplication {

    @GetMapping("/message")
    public String message() {
        return "This app is deployed to Azure. Welcome!";
    }

    public static void main(String[] args) {
        SpringApplication.run(AzureTestApplication.class, args);
    }

}
