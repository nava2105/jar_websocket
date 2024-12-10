package com.example.jar_websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JarWebsocketApplication {
    public static void main(String[] args) {
        SpringApplication.run(JarWebsocketApplication.class, args);
        System.out.println("WebSocket server running in: http://localhost:8080/ws/hello");
        System.out.println("WebSocket client running in: http://localhost:8080");
        System.out.println("Swagger documentation in: http://localhost:8080/swagger-ui/index.html");
    }
}
