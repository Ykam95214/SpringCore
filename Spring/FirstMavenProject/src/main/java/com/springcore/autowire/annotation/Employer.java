package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employer {

    private String name;
    @Autowired
    @Qualifier("hr2")
    public HR hr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HR getHr() {
        return hr;
    }

    public void setHr(HR hr) {
        this.hr = hr;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", hr=" + hr +
                '}';
    }
}
