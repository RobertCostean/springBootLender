package com.example.security.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Users {

    @Id
    private String username;
    private String password;

    public Users() {
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
