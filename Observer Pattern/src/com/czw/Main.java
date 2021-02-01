package com.czw;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.attach(new BinaryObserver(subject));
        subject.attach(new OctalObserver(subject));
        subject.attach(new HexaObserver(subject));

        subject.setState(13);
    }
}
