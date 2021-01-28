package com.czw;

public class Main {
    public static void main(String[] args) {
        String message = "陈子文喜欢吃饭";
        AndExpression andExpression = new AndExpression(new ContainExpression("陈子文"), new ContainExpression("饭"));
        boolean interpreter = andExpression.interpreter(message);//解析是否包含陈子文和饭
        System.out.println("这句话里面包含 陈子文 和 饭 吗？"+ interpreter);
    }
}
