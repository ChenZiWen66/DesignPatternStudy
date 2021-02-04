package com.czw;

public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Debug过滤器:"+request);
    }
}
