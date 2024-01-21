package org.example.injectreference;

public class B {
    private String Name;

    public void setName(String name){
        this.Name=name;
    }

    public String getName(){
        return this.Name;
    }

    public B(){
        super();
    }

    public String toString(){
        return "B [Name= " + Name + "]";
    }
}
