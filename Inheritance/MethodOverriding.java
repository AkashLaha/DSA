package com.akash.Inheritance;

class Super{
    void display(){
        System.out.println("hello");
    }
}
class Sub extends Super{
    void display(){
        System.out.println("hello world");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Super su=new Sub();//Dynamic Method Dispatch
        su.display();
    }
}
