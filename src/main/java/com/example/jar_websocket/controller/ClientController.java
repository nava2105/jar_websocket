package com.example.jar_websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {

    @GetMapping("/")
    public String home() {
        // Devuelve el archivo index.html desde el directorio static
        return "index.html";
    }
}