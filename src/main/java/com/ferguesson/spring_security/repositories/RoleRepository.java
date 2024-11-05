package com.ferguesson.spring_security.repositories;


import com.ferguesson.spring_security.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findRoleByName(String username);
}
