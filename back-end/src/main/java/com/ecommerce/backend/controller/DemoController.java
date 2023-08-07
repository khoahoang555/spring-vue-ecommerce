package com.ecommerce.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> index() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}
