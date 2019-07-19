package com.example.user_service.service;

import com.example.user_service.bean.UserBean;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UserBean findUserById(Long id);

    UserBean findUserByMobile(String mobile);
}
