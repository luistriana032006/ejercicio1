package com.devsenior.ejercicio1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController // que envia datos al cliente y recibe datos al cliente mediante endpoints
public class ejercicio1Controller {

    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
}
