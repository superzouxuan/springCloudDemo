package com.example.user_service.service.impl;

import com.example.user_service.bean.UserBean;
import com.example.user_service.dao.UserDao;
import com.example.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserBean findUserById(Long id) {
        return userDao.findUserById(id);
    }

    @Override
    public UserBean findUserByMobile(String mobile) {
        return userDao.findUserByMobile(mobile);
    }
}
