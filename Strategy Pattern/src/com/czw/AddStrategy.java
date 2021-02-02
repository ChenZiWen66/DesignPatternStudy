package com.czw;

/**
 * 加法策略
 */
public class AddStrategy implements Strategy {
    @Override
    public int doStrategy(int num1, int num2) {
        return num1 + num2;
    }
}
