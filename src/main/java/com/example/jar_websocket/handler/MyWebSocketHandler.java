package com.example.jar_websocket.handler;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MyWebSocketHandler extends TextWebSocketHandler {

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        // Envía un mensaje JSON "Hola Mundo" al cliente cuando se establece la conexión
        String jsonMessage = "{\"message\": \"Hola Mundo desde WebSocket en Java\"}";
        session.sendMessage(new TextMessage(jsonMessage));
    }
}
