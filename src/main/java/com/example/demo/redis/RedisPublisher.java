package com.example.demo.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisPublisher {
    private final StringRedisTemplate stringRedisTemplate;

    public RedisPublisher(StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }

    public void publishMessage(String channel, String message) {
        stringRedisTemplate.convertAndSend(channel, message);
    }
}
