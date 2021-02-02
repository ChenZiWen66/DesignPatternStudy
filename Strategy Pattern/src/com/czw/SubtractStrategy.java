package com.czw;

public class SubtractStrategy implements Strategy{
    @Override
    public int doStrategy(int num1, int num2) {
        return num1-num2;
    }
}
