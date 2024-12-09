package com.example.jar_websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JarWebsocketApplication {
    public static void main(String[] args) {
        SpringApplication.run(JarWebsocketApplication.class, args);
        System.out.println("Servidor WebSocket iniciado en http://localhost:8080/ws/hello");
        System.out.println("Cliente WebSocket iniciado en http://localhost:8080");
    }
}
