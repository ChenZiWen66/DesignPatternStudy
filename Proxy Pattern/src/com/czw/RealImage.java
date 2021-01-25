package com.czw;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        loadImage();
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("显示了一个图片:"+fileName);
    }

    private void loadImage(){
        System.out.println("正在加载图片...");
    }
}
