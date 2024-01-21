package com.springcore.autowire.annotation;

public class HR {

    private String name;

    private String department;

    public void setName(String name) {
        System.out.println("Setting hrName");
        this.name = name;
    }

    public void setDepartment(String department) {
        System.out.println("setting hrDepartment");
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "HR{" +
                "Name='" + name + '\'' +
                ", Department='" + department + '\'' +
                '}';
    }
}
