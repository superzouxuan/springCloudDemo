package com.example.auth.authentication;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

/**
 * AuthenticationProvider统一由authenticationManager管理，manager中可以有多个provider。
 * 具体执行授权的是provider，provider需要从UserDetailService中获取用户信息，可以通过重写userDetailService
 * 来改变用户来源
 */
public class MyAuthenticationProvider implements AuthenticationProvider {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
