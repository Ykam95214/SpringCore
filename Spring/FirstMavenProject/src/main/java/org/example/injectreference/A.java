package org.example.injectreference;

public class A {

    private String Name;
    private B b;

    public void setName(String Name){
        this.Name=Name;
    }

    public String getName(){
        return this.Name;
    }

    public void setb(B b){
        this.b=b;
    }

    public B getb(){
        return this.b;
    }

    public A(){
        super();
    }

    public String toString(){
        return "A [Name=" + Name + ", b= " + b + "]";
    }
}
