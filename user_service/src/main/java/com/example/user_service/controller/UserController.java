package com.example.user_service.controller;

import com.example.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("get")
    public Object getUserByMobile(String mobile){
        return userService.findUserByMobile(mobile);
    }


}
