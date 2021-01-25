package com.czw;

public class ImageFile extends File {
    public ImageFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是图片文件，它的名字是"+super.getName());
    }
}
