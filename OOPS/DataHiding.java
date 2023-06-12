package com.akash.OOPS;

public class DataHiding {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.setLen(10);;
        r1.setBr(8);
        System.out.println("Area: "+r1.area());
        System.out.println("Perimeter: "+r1.perimeter());
        System.out.println("SquareORnot: "+r1.isSquare());
        System.out.println("length "+r1.getLen());
        System.out.println("breadth "+r1.getBr());
    }
}
class Rectangle{
    private double len;
    private double br;

    public double getLen(){
        return len;
    }
    public void setLen(double length){
        len=length;
    }
    public double getBr(){
        return br;
    }
    public void setBr(double breadth){
        br=breadth;
    }

    public double perimeter(){
        return 2*(len+br);
    }
    public double area(){
        return len*br;
    }

    public boolean isSquare(){
        if(len==br)
            return true;
        else
            return false;
    }


}
