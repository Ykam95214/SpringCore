package com.springcore.ci;

public class Addition {
    private int a;
    private int b;

    public Addition(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("Constructor : int , int");
    }

    public Addition(double a, double b){
        this.a= (int)a;
        this.b= (int)b;
        System.out.println("Constructor : double , double");
    }


//    ByDefault (means if you are not providing type of the argument)
//    Spring will consider agrument of constructor as String
    public Addition(String a, String b){
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("Constructor : String , String");
    }

    public void doSum(){
        System.out.println("a = " + this.a);
        System.out.println("b = " + this.b);
        System.out.println("a+b = " + (this.a+this.b));
    }
}
