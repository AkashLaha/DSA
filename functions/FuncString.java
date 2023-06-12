package com.akash.functions;
import java.util.Scanner;
public class FuncString {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String name=sc.nextLine();
//        String b=greet(name);
//        System.out.println(b);
//    }
//    static String greet(String name){
//
//        String a="hello "+name;
//        return a;
//    }

//    public static void main(String[] args) {
//        String shout=caps("who ar u!!!!");
//        System.out.println(shout);
//    }
//    static String caps(String s){
//        return s.toUpperCase();
//    }

    public static void main(String[] args) {
        String name="akash";
        greet(name);
        System.out.println(name);

    }
    static void greet(String naam){
        naam="aka";
        //naam is a copy of name
        //when value is assigned to naam, value of naam is created, it will not change the value original reference var(name)
    }
}
