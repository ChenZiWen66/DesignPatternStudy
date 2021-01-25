package com.czw;

public class ProxyImage implements Image {
    private Image realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage==null){
            System.out.println("连接远程服务...");
            System.out.println("进行安全验证...");
            System.out.println("对文件名进行加密...");
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
