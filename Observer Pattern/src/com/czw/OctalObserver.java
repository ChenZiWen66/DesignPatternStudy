package com.czw;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("十进制:"+Integer.toOctalString(subject.getState()));
    }
}
