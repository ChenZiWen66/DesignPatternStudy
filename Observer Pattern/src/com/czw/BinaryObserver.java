package com.czw;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("二进制:"+Integer.toBinaryString(subject.getState()));
    }
}
