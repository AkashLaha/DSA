package com.akash.Inheritance;

class Rectangle2{
    int length;
    int breadth;
    Rectangle2(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void display(){
        System.out.println("Length:"+this.length);
        System.out.println("Breadth:"+this.breadth);
    }
}
public class thiskeyword {
    public static void main(String[] args) {
        Rectangle2 r=new Rectangle2(10,5);
        r.display();
    }
}
