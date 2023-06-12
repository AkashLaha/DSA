package com.akash.OOPS;

//exmaple of rectangle
public class Constructor1 {
    public static void main(String[] args) {
        Rectangles r1=new Rectangles(-10,-5);
        System.out.println("Area: "+r1.area());
        System.out.println("Perimeter: "+r1.Perimeter());
        System.out.println("SquareORnot: "+r1.isSquare());

    }
}
class Rectangles{
    private double length;
    private double breadth;

    public Rectangles(){
        length=1;
        breadth=1;
    }
    public Rectangles(double l, double b){
        setLength(l);
        setBreadth(b);
    }
    public Rectangles(double l,double s,double b){
        length=breadth=s;
    }
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }

    public void setLength(double l) {
        if(l>0){
            length=l;
        }
        else {
            length=0;
        }
    }

    public void setBreadth(double b) {
        if (b>0){
            breadth = b;
        }
        else{
            breadth=0;
        }
    }
    public double area(){
        return getLength()*getBreadth();
    }
    public double Perimeter(){
        return 2*(getLength()+getBreadth());
    }
    public boolean isSquare(){
        if(length==breadth){
            return true;
        }
        else{
            return false;
        }
    }
}
