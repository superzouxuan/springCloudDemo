package com.example.user_service.dao;

import com.example.user_service.bean.UserBean;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    UserBean findUserById(Long id);

    UserBean findUserByMobile(String mobile);
}
