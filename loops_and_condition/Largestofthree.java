package com.akash.loops_and_condition;
import java.util.Scanner;
public class Largestofthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a: ");
        int a=sc.nextInt();
        System.out.println("enter b: ");
        int b=sc.nextInt();
        System.out.println("enter c: ");
       int c=sc.nextInt();
//
//        int max=a;
//        if (b>max){
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }
//        System.out.println(max);


        //We can also use
        //int a=22;
        //int b=21;
        //int c=33;
        int max=(Math.max(c,Math.max(a,b)));
        System.out.println(max);

    }
}
