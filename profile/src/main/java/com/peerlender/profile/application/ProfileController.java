package com.peerlender.profile.application;

import com.peerlender.profile.domain.model.Users;
import com.peerlender.profile.domain.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    private final UserRepository userRepository;

    @Autowired
    public ProfileController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<Users> findAllUsers(){
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public void newUser(@RequestBody final Users users){
        users.setRegisteredSince(LocalDate.now());
        userRepository.save(users);
    }

    @PutMapping("/users")
    public void updateUser(@RequestBody final Users users){
        userRepository.save(users);
    }
}
