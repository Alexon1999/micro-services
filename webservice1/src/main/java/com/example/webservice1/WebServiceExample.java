package com.example.webservice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServiceExample {

    @GetMapping("/")
    public String sayHello(){
        return "<h1>Hello from Microservice 1!</h1>";
    }
}
