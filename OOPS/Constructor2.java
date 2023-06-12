package com.akash.OOPS;

public class Constructor2 {
    public static void main(String[] args) {
        Cylinder cyl=new Cylinder(2,3);
        System.out.println("Area: "+cyl.Surarea());
        System.out.println("Volume: "+cyl.Vol());
    }
}
class Cylinder{
    private double radius;
    private double height;

    Cylinder(double r, double h){
        setRadius(r);
        setHeight(h);
    }
    public void setRadius(double r){
        radius=r;
    }
    public void setHeight(double h){
        height=h;
    }
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
    public double Surarea(){
        return 2*Math.PI*getRadius()*(getHeight()+getRadius());

    }
    public double Vol(){
        return Math.PI*getRadius()*getRadius()*getHeight();
    }
}
