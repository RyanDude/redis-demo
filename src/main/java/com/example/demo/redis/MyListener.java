package com.example.demo.redis;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener implements MessageListener {
//    private final RedisCache redisCache;
    @Override
    public void onMessage(Message message, byte[] pattern) {
        String receivedMessage = new String(message.getBody());
        System.out.println("Received message: " + receivedMessage);
    }
}
