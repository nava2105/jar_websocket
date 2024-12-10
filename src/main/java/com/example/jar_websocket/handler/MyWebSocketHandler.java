package com.example.jar_websocket.handler;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MyWebSocketHandler extends TextWebSocketHandler {

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        // Sends a "Hello World" JSON message to the client when the connection is established.
        String jsonMessage = "{\"message\": \"Hello World from WebSocket in Java\"}";
        session.sendMessage(new TextMessage(jsonMessage));
    }
}
