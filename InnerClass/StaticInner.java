package com.akash.InnerClass;

class Outer4{
    int x=10;
    static int y=20;
    static class Inner4{
        public void My(){
            System.out.println(y);
        }
    }
}
public class StaticInner {
    public static void main(String[] args) {
        Outer4.Inner4 oi=new Outer4.Inner4();
        oi.My();
    }
}
