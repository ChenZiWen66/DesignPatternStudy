package com.czw;

public class BusinessDelegate {
    LookupService lookupService;
    BusinessService businessService;
    String serviceName;

    public BusinessDelegate() {
        lookupService = new LookupService();
        serviceName = "service1";
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public void doTask(){
        BusinessService businessService = lookupService.searchService(serviceName);
        businessService.doProcess();
    }
}
