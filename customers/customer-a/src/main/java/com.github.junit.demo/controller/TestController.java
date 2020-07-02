package com.github.junit.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    private RestTemplate restTemplate = new RestTemplate();
    @GetMapping("/user")
    public String getUser() {
        ResponseEntity<String> response = this.restTemplate.getForEntity("http://localhost:9999/user", String.class);
        System.out.println(response.getBody()+"=================================");
        return response.getBody();
    }
}
