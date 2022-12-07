package com.example.security.user.model.repository;

import com.example.security.user.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, String> {

}
