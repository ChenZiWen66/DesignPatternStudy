package com.czw;

public class Dispatcher {
    private HomeView homeView;
    private StudentView studentView;

    public Dispatcher() {
        homeView = new HomeView();
        studentView = new StudentView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("Home")) {
            homeView.show();
        } else {
            studentView.show();
        }
    }
}
