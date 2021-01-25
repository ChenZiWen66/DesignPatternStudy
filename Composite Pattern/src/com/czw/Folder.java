package com.czw;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {
    private List<File> files;

    public Folder(String name) {
        super(name);
        files = new ArrayList<>();
    }

    public void add(File file) {
        files.add(file);
    }

    public void remove(File file) {
        files.remove(file);
    }

    @Override
    public void display() {
        System.out.println("****************"+super.getName()+"****************");
        for (File file : files) {
            file.display();
        }
        System.out.println("********************************");
    }
}
