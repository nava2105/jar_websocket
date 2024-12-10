package com.example.jar_websocket.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

import java.util.concurrent.CompletableFuture;

@RestController
public class ClientController {

    @GetMapping("/")
    public ResponseEntity<String> home() {
        try {
            // Create a WebSocket client
            StandardWebSocketClient client = new StandardWebSocketClient();

            // CompletableFuture to handle the received message
            CompletableFuture<String> futureMessage = new CompletableFuture<>();

            // Set the handler to handle the connection
            client.execute(new AbstractWebSocketHandler() {
                @Override
                public void afterConnectionEstablished(org.springframework.web.socket.WebSocketSession session) {
                    try {
                        // Simula la recepción de un mensaje después de conectarse
                        session.sendMessage(new TextMessage("Client connected to WebSocket"));
                        futureMessage.complete("{\"message\": \"Hello World from WebSocket in Java\"}");
                        session.close();
                    } catch (Exception e) {
                        futureMessage.completeExceptionally(e);
                    }
                }
            }, "ws://localhost:8080/ws/hello");

            // Obtener el mensaje recibido
            String jsonResponse = futureMessage.get();

            // Devolver el mensaje como ResponseEntity
            return new ResponseEntity<>(jsonResponse, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>("{\"error\": \"WebSocket connection failed\"}", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}