package com.github.springboot.service.impl;

import com.github.springboot.domain.User;
import com.github.springboot.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User queryOne(String username) {
        User user = new User();
        user.setUsername(username);
        user.setPassword("123456");
        return user;
    }
}
