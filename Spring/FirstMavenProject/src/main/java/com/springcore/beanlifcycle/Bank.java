package com.springcore.beanlifcycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bank {

    private int accountNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Bank(){
        super();
    }

    public String toString() {
        return "this.accountNumber";
    }

    @PostConstruct
    public void init(){
        System.out.println("I am inside init() method.");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("I am inside destroy method and going to die...");
    }
}
