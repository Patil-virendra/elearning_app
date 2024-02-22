package com.jwt.example.jwtExample3.controller;

import com.jwt.example.jwtExample3.entities.User;
import com.jwt.example.jwtExample3.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;


@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;
    Logger logger=LoggerFactory.getLogger(HomeController.class);


    @GetMapping("/user")
    public List<User> user(){
        this.logger.warn("getting users");
        return this.userService.getUsers();
    }

    @GetMapping("/current-user")
    public String getLoggedUserName(Principal principal)
    {
        return principal.getName();
    }
}
