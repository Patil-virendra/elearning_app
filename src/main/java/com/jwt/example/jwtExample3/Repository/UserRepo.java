package com.jwt.example.jwtExample3.Repository;

import com.jwt.example.jwtExample3.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,String> {


    public Optional<User> findByEmail(String email);
}
