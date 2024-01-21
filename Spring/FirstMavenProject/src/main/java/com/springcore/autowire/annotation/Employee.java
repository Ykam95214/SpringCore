package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public HR getHr() {
        return hr;
    }

    public void setHr(HR hr) {
        this.hr = hr;
    }

    @Autowired
    @Qualifier("hr1")
    public HR hr;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hr=" + hr +
                '}';
    }
}
