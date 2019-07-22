package com.example.auth.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.client.RestTemplate;

/**
 * AuthenticationProvider统一由authenticationManager管理，manager中可以有多个provider。
 * 具体执行授权的是provider，provider需要从UserDetailService中获取用户信息，可以通过重写userDetailService
 * 来改变用户来源
 */
public class MyAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 该方法我们可以拿到form-data的数据，并且返回一个UserDetails如果登录成功的话，或者返回null如果登录失败。
     * @param authentication
     * @return
     * @throws AuthenticationException
     */
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getPrincipal().toString();
        String password = authentication.getCredentials().toString();
        String url = String.format("http://%s/user/get", "user-server");
        String forObject = restTemplate.getForObject(url, String.class);
        if (true){
            return new UsernamePasswordAuthenticationToken(username,password);
        }
        return null;
    }

    /**
     * 告诉spring sec支持哪种验证
     * @param aClass
     * @return
     */
    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}
