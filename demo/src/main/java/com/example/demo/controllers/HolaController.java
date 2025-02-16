package com.example.demo.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping(value = "/", produces = "text/html")
    public String holaSpring() {
        return "<html><body><h1>¡Hola Spring!</h1></body></html>";
    }
}