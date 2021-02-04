package com.czw;

public class InitialContext {
    public Object lookup(String serviceName){
        if (serviceName.equalsIgnoreCase("service1")){
            System.out.println("创建一个Service1服务");
            return new Service1();
        }else if (serviceName.equalsIgnoreCase("service2")){
            System.out.println("创建一个Service2服务");
            return new Service2();
        }else {
            return null;
        }
    }
}
