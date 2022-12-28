package com.example.security.user.service;

import com.example.security.user.model.Users;
import com.google.gson.Gson;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    private final RabbitTemplate rabbitTemplate;
    private final static Gson GSON = new Gson();

    @Autowired
    public NotificationService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(Users users){
        rabbitTemplate.convertAndSend("userRegisteredTopic", "user.registered", GSON.toJson(users));
    }
}
