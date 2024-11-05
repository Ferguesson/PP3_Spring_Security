package com.ferguesson.spring_security.repositories;


import com.ferguesson.spring_security.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
