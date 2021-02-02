package com.czw;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        System.out.println(context.doStrategy(4, 3));
        context.setStrategy(new SubtractStrategy());
        System.out.println(context.doStrategy(4, 3));
        context.setStrategy(new MultiStrategy());
        System.out.println(context.doStrategy(4, 3));

    }
}
