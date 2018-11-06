package com.github.springboot.controller;

import com.github.springboot.domain.User;
import com.github.springboot.properties.GeneralProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private GeneralProperties generalProperties;

    @RequestMapping("/login")
    public User login() {
        User user = new User();
        user.setUsername("tom");
        user.setPassword("123456");
        return user;
    }

    @RequestMapping("/test")
    public String test() {
        return generalProperties.getAppName();
    }

}
