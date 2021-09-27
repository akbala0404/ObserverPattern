package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User implements Observer{
    private String name;
    public User(String name) {
        this.name = name;
    }
    @Override
    public void update( HashMap<String,String> info) {
        //info.forEach((symbol, value) -> System.out.println("Hello "+ this.name+"!" + " "+"This is your homework for  " + symbol + " --->" + value));
        System.out.println("Hello " + this.name +"! This is your homework for this week" + info);
    }
}
