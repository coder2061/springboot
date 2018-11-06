package com.github.springboot.service;

import com.github.springboot.domain.User;

public interface UserService {

    User queryOne(String username);
}
