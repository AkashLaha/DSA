package com.akash.Inheritance;

class Super1{
    void meth1(){
        System.out.println("print meth1");
    }
    void meth2(){
        System.out.println("print Supermeth2");
    }
}
class Sub1 extends Super1{
    void meth2(){
        System.out.println("print Submeth2");
    }
    void meth3(){
        System.out.println("print meth3");
    }

}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Super1 su=new Sub1();
        su.meth1();
        su.meth2();
    }
}
