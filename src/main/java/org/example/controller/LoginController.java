package org.example.controller;

import org.example.model.User;
import org.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;


    @Bean
    public User user1(){
        User user = new User();
        user.setUsername("upupoo0");
        user.setPassword("000524");
        return user;
    }

    @Bean
    public User user2(){
        User user = new User();
        user.setUsername("upupoo00");
        user.setPassword("000524");
        return user;
    }
}
