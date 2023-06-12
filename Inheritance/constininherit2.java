package com.akash.Inheritance;
//Here Parameterised constructor are used in inheritance

public class constininherit2 {
    public static void main(String[] args) {
        Child2 ch=new Child2(10,20);
    }
}
class Parent2{
    public Parent2(){
        System.out.println("non param parent");
    }
    public Parent2(int x){
        System.out.println("param parent"+x);
    }
}
class Child2 extends Parent2{
    public Child2(){
        System.out.println("non param child");
    }
    public Child2(int y){
        System.out.println("param child");
    }
    public Child2(int x,int y){
        super(x);
        System.out.println("2 param of child"+y);
    }
}
class Grandchild2 extends Child2{
    public Grandchild2(){
        System.out.println("non param gchild");
    }
    public Grandchild2(int z){
        System.out.println("param gchild");
    }
}
