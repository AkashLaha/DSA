package com.akash.Inheritance;

public class Example1 {
    public static void main(String[] args) {
        Cellphone cell=new Cellphone();
        smartphone sm=new smartphone();
        sm.call();
    }
}
class Cellphone{
    public double phno;
    public double imie;
    public void call(){
        System.out.println("phone is ringing");
    }
    public void sms(){
        System.out.println("message");
    }
    public void SaveContent(){
        System.out.println("data is stored");
    }
    public void DeleteContent(){
        System.out.println("data is deleted");
    }
}
class smartphone extends Cellphone{
    private String mac;

    smartphone(){
        mac="ew34524";
    }
    public void click(){
        System.out.println("clicked");
    }
    public void Capture(){
        System.out.println("photo is capture");
    }
}
