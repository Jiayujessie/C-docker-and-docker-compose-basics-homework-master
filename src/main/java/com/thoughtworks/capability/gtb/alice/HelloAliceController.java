package com.thoughtworks.capability.gtb.alice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloAliceController {
    @GetMapping("/hello")
    public String hello() {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://localhost:8080/server/get", String.class);
        return "Hello from Bob!";
    }
}


