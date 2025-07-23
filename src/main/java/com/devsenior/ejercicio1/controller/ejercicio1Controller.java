package com.devsenior.ejercicio1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Map;
import java.util.HashMap;
import org.springframework.web.bind.annotation.PathVariable;

@RestController // que envia datos al cliente y recibe datos al cliente mediante endpoints
public class ejercicio1Controller {

    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String("Hola Mundo");
    }
    /*
     * segun el nombre que se le pase, asigna un saludo personalizado 
     */
    @GetMapping("/saludo/personalizado/{nombre}")
    public Map <String, String> obtenerSaludoPersonalizado(@PathVariable String nombre){
        return new HashMap<>();
    }
    
}
