package com.xgrt.service.impl;

import com.xgrt.domain.User;
import com.xgrt.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {
        System.out.println("user service……");
    }
}
