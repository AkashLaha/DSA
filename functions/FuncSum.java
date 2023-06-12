package com.akash.functions;
import java.util.Scanner;
public class FuncSum {
    public static void main(String[] args) {
        int ans=sum(20,40);
        System.out.println(ans);
        // calling func as many tines you want
//        sum();
//        sum();

    }
//    static void sum(){
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=a+b;
//        System.out.println(c);
//    }
    static int sum(int a,int b){
        int c=a+b;
        return c;
    }
}
