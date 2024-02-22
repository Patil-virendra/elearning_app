package com.jwt.example.jwtExample3.service;

import com.jwt.example.jwtExample3.Repository.UserRepo;
import com.jwt.example.jwtExample3.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user= this.userRepo.findByEmail(username).orElseThrow(()->new RuntimeException("User Not Found Exception"));

        //load user from database
        return user;
    }
}
