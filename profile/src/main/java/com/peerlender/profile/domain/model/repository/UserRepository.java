package com.peerlender.profile.domain.model.repository;

import com.peerlender.profile.domain.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, String> {
}
