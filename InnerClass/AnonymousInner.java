package com.akash.InnerClass;

abstract class My{
    abstract void show();
}
class Outer3{
    public void disp(){
        //new My(){public void show(){System.out.println("hello");}}.show();
        My m=new My(){
            public void show(){
                System.out.println("hello");
            }
        };
        m.show();
    }
}
public class AnonymousInner {
    public static void main(String[] args) {
        Outer3 o=new Outer3();
        o.disp();
    }
}
