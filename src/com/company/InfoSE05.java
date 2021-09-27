package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InfoSE05 implements Observable{
    private List<Observer> users= new ArrayList<>();
    HashMap<String,String>  info=new HashMap<>();;

    public InfoSE05() {
    }
    @Override
    public void unregister(Observer user) {
        this.users.remove(user);

    }
    @Override
    public void register(Observer user) {
        this.users.add(user);
    }

    @Override
    public void notifyuser() {
        for(Observer user:this.users) {
            user.update(this.info);
        }
    }
    public void setInfo( String subject, String assignment1) {
            this.info.put(subject,assignment1);
            notifyuser();
    }
}
