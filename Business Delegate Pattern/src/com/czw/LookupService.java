package com.czw;

public class LookupService {
    public BusinessService searchService(String serviceName){
        if (serviceName.equalsIgnoreCase("service1")){
            return new Service1();
        }else {
            return new Service2();
        }
    }
}
