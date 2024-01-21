package com.springcore.ci;
import java.util.List;
public class Person {
    private String name;
    private int personId;

    private List<Double> marks;

    public Person(String name , int personId){
        this.name=name;
        this.personId=personId;
    }

    public Person(String name, int personId, List<Double> marksList){
        this.name=name;
        this.personId=personId;
        this.marks=marksList;
    }

    @Override
    public String toString(){
        return "name = "+this.name+ " persionId= "+ this.personId + " & List of marks: " + this.marks;
    }
}
