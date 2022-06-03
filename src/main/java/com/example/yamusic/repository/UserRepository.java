package com.example.yamusic.repository;

import com.example.yamusic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User getByUsername(String username);
}
