package org.example.config;

import org.example.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
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
