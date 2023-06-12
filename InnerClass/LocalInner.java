package com.akash.InnerClass;

class Outer1{
    public void disp(){
        class Inner2{
            public void show(){
                System.out.println("hello");
            }

        }
        //this is an anonymous object it will perform the same task as obj creation
        //new Inner2().show();
        Inner2 in=new Inner2();
        in.show();
    }

}
public class LocalInner {
    public static void main(String[] args) {
        Outer1 ou=new Outer1();
        ou.disp();
    }
}
//here the disp method creates the obj of inner class calls the show method
