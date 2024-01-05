package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prices")
public class PriceController {
    @GetMapping
    public ResponseEntity<String> getEvents() {
        return ResponseEntity.ok(" + Data from Price service ");
    }
}
