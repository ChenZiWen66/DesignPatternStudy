package com.czw;

public class Main {
    public static void main(String[] args) {
        System.out.println("***************在本地创建对象***************");
        RealImage realImage = new RealImage("src/czw.jpg");
        realImage.display();
        realImage.display();

        System.out.println("***************在外地不使用代理类创建对象***************");
        System.out.println("连接VPN操作");
        System.out.println("验证防火墙操作");
        System.out.println("文件名加密操作");
        RealImage realImage1 = new RealImage("src/czw.jpg");
        realImage1.display();
        realImage1.display();

        System.out.println("***************在外地使用代理类创建对象***************");
        ProxyImage proxyImage = new ProxyImage("src/czw.jpg");
        proxyImage.display();
        proxyImage.display();
    }
}
