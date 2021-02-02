package com.czw;

public class Main {
    public static void main(String[] args) {
        ComputerPartVisitor oldPeople = new OldPeople();
        ComputerPartVisitor youngPeople = new YoungPeople();
        ComputerPartVisitor naughtyKid = new NaughtyKid();

        Computer computer = new Computer();
        computer.add(new KeyBoard());
        computer.add(new Monitor());
        computer.add(new Mouse());

        computer.accept(oldPeople);
        System.out.println("----------------------");
        computer.accept(youngPeople);
        System.out.println("----------------------");
        computer.accept(naughtyKid);
        System.out.println("----------------------");


    }
}
