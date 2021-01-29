package com.czw;

public class Main {
    public static void main(String[] args) {
        Colleague colleague1 = new ConcreteColleague1();
        Colleague colleague2 = new ConcreteColleague2();
        Mediator mediator = new ConcreteMediator();
        mediator.register(colleague1);
        mediator.register(colleague2);

        colleague1.send();
        colleague2.send();
    }
}
