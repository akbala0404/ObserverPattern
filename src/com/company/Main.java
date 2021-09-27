package com.company;

public class Main {

    public static void main(String[] args) {
         InfoSE05 info = new InfoSE05();
         info.setInfo("SDP","1 example with Observer Pattern");
         info.setInfo("DBMS"," Prepare for Quiz");

         User someuser =new User("Akbala");
         info.register(someuser);
         User someuser2= new User("Aiym");
         info.register(someuser2);
         info.setInfo("Advanced Java","Create register form");


    }
}
