package com.czw;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<Filter> filterList;
    private Target target;

    public void addFilter(Filter filter){
        filterList.add(filter);
    }

    public FilterChain() {
        filterList = new ArrayList<>();
        target = new Target();
    }

    public void execute(String request) {
        for (Filter filter : filterList) {
            filter.execute(request);
        }
        target.doTask(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
