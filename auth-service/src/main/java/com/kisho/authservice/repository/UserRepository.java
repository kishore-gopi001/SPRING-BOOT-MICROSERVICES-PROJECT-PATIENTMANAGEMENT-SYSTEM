package com.kisho.authservice.repository;

import java.util.Optional;
import java.util.UUID;

import com.kisho.authservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByEmail(String email);
}
