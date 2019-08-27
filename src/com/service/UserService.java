package com.service;

import com.entity.User;

public interface UserService {
    User login(String username, String pwd);
}
