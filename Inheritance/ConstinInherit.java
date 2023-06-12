package com.akash.Inheritance;

public class ConstinInherit {
    public static void main(String[] args) {
        //Child ch=new Child();
        /*when create a obj of child class the constructor
        of parent class will be called first then child constructor*/
        Grandchild gc=new Grandchild();
    }
}
class Parent{
    public Parent(){
        System.out.println("parent constructor");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Child constructor");
    }
}
class Grandchild extends Child{
    public Grandchild(){
        System.out.println("grandChild constructor");
    }
}
