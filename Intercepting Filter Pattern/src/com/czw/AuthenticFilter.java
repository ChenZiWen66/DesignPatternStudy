package com.czw;

public class AuthenticFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("认证过滤器:"+request);
    }
}
