package com.akash.InnerClass;

class Outer{
    int x=10;
    class Inner{
        int y=20;
        public void innerDisp(){
            System.out.println(x+" "+y);
        }
    }
    public void Outerdisp(){
        Inner in=new Inner();
        in.innerDisp();
        System.out.println(in.y);
    }
}
public class nestedInner {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.Outerdisp();
        //accessing inner class inside the main method

        Outer.Inner oi=new Outer().new Inner();
        oi.innerDisp();
    }
}
