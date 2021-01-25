package com.czw;

public class VideoFile extends File {
    public VideoFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是一个视频文件，它的名字是:"+super.getName());
    }
}
