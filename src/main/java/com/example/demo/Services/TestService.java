package com.example.demo.Services;

import com.example.demo.redis.RedisPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Value("${redis.pubsub.topic.channel-events}")
    private String channel;
    private final RedisPublisher publisher;

    public TestService(RedisPublisher publisher) {
        this.publisher = publisher;
    }
    public void sendAMsg(){
        this.publisher.publishMessage(channel, "test");
    }
}
