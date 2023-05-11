package com.svoglimacci.cookbookbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CookbookBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CookbookBackendApplication.class, args);
    }


}