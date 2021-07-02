package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/mundo")
public class HelloWorld {

    @GetMapping
    public String helloWorld(){
        return "hola mundo";
    }
}
