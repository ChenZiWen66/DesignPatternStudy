package com.czw;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Student(), new StudentView());
        controller.setStudentName("czw");
        controller.setStudentRollNo("123456");

        controller.updateView();
    }
}
