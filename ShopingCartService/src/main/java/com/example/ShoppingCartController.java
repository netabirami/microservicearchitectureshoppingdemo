package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/items")
public class ShoppingCartController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<String> getClient() {
        return ResponseEntity.ok(restTemplate.getForObject("http://localhost:8081/products", String.class)+ " + Data from shopping cart service");
    }
}
