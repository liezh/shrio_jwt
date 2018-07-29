package com.liezh.shrio_jwt.security;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * Created by Administrator on 2018/7/29.
 */
public class JWTToken implements AuthenticationToken {
    // 密钥
    private String token;

    public JWTToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }

}
