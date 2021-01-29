package com.czw;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagueList = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagueList.contains(colleague)) {
            colleagueList.add(colleague);
            colleague.mediator = this;
        }
    }

    @Override
    //给中介类中的其他成员发消息
    public void relay(Colleague colleague) {
        for (Colleague col:colleagueList){
            if (col!=colleague){
                col.receive();
            }
        }
    }
}
