package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class vistas {
    @GetMapping("/")
    public String index(){
        return "Hola desde home :D";
    }
}
