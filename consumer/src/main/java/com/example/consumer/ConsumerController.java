package com.example.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    String consume() {
        return restTemplate.getForObject("http://provider:8080", String.class);
    }
}
