package com.example.security.application;

import com.example.security.user.exception.UserNotFoundException;
import com.example.security.user.model.Users;
import com.example.security.user.model.repository.UserRepository;
import com.example.security.user.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;
    private final NotificationService notificationService;

    @Autowired
    public UserController(UserRepository userRepository, NotificationService notificationService) {
        this.userRepository = userRepository;
        this.notificationService = notificationService;
    }

    @PostMapping("/register")
    public void register(@RequestBody Users users){
        userRepository.save(users);
        notificationService.sendMessage(users);
    }

    @PostMapping("/validate")
    public String validateTokenAndGetUsername(@RequestHeader("Authorization") String token){
        return userRepository.findById(token).orElseThrow(UserNotFoundException::new).getUsername();
    }
}
