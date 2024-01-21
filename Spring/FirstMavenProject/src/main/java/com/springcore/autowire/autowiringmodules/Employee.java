package com.springcore.autowire.autowiringmodules;

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

    public HR hr;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hr=" + hr +
                '}';
    }
}
