package com.akash.Inheritance;
//
//abstract class Sup{
//    public Sup(){
//        System.out.println("sup constructor");
//    }
//    public void meth1(){
//        System.out.println("meth1 of sup");
//    }
//    abstract public void meth2();
//}
//class Subb extends Sup{
//    public void meth2(){
//        System.out.println("meth2 of subb");
//    }
//}
//public class AbstractClass {
//    public static void main(String[] args) {
//        Sup s=new Subb();
//        s.meth1();
//    }
//}

//abstract class shape exp
abstract class Shape{
    abstract public double perimeter();
    abstract public double area();
}
class Circle2 extends Shape{
    double radius;
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Rect extends Shape{
    double length;
    double breadth;
    public double perimeter(){
        return 2*length+2*breadth;
    }
    public double area(){
        return length*breadth;
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Circle2 cr = new Circle2();
        cr.radius=4;
        System.out.println(cr.perimeter());
        System.out.println(cr.area());
        Rect re=new Rect();
        re.breadth=2;
        re.length=3;
        System.out.println(re.perimeter());
        System.out.println(re.area());
    }
}