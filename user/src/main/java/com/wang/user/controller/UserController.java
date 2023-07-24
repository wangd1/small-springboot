package com.wang.user.controller;

import com.wang.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangd1
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/user")
    public String getUser(){
        return userService.getUser();
    }

}
