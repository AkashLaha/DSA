package com.akash.Inheritance;

//java 8th ver allows default and static concrete methods
//interface Test2{
//    default void run(){
//
//    }
//    static void display(){
//
//    }
//}
class Phone{
    void sms(){
        System.out.println("sending sms");
    }
    void call(){
        System.out.println("calling someone");
    }
}
interface camera{
    void capture();
    void selfie();
}
interface musicplayer{
    void play();
    void pause();

}
class Smartphone extends Phone implements camera,musicplayer{
    void videocall(){
        System.out.println("videocalling");
    }
    public void capture(){
        System.out.println("capture photo");
    }
    public void selfie(){
        System.out.println("capture selfie");
    }
    public void play(){
        System.out.println("play music");
    }
    public void pause(){
        System.out.println("pause music");
    }

}
public class Interface {
    public static void main(String[] args) {
        Smartphone sm=new Smartphone();
        sm.capture();
        sm.play();
        sm.call();
        sm.videocall();
    }
}
