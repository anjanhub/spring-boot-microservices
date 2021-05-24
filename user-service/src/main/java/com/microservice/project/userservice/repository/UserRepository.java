package com.microservice.project.userservice.repository;

import com.microservice.project.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByuserId(Long userId);
}
