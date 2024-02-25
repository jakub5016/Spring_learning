package com.example.First.Spring.App;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordControler {

    @GetMapping(path = "/hello")
    public String helloWorld() {
        return "Hello Jakub";
    }
}
