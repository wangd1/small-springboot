package com.wang.user.service.impl;

import com.wang.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author wangd1
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUser() {
        return "hello user";
    }
}
