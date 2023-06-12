package com.akash.hackerrank;

import java.util.Scanner;
import java.io.*;

public class Stdinandout {

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//
//        int i = scan.nextInt();
//        double d=scan.nextDouble();
//        String s=scan.nextLine();
//
//
//
//
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
//    }

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j=1;j<=n;j++){
                int r=0;
                for(int k=0;k<j;k++){
                    r=r+(int)Math.pow(2,k)*b;

                }
                System.out.print(r+" ");

            }
        }
        in.close();
    }
}
