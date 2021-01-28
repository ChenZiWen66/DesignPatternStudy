package com.czw;

/**
 * 一个具体的表达式,看要解析的message里面是否包含data
 */
public class ContainExpression implements Expression{
    private String data;

    public ContainExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpreter(String message) {
        return message.contains(data);
    }
}
