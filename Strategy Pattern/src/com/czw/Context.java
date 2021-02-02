package com.czw;

/**
 * 环境类
 */
public class Context {
    private Strategy strategy;

    public Context() {
        this.strategy = new AddStrategy();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int doStrategy(int num1, int num2) {
        return strategy.doStrategy(num1, num2);
    }
}
