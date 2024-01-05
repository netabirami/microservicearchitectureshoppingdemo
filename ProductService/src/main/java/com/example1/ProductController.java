package com.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<String> getEvents() {
        return ResponseEntity.ok(restTemplate.getForObject("http://price-service:8082/prices", String.class) +" Data from Product Service");
    }
}
