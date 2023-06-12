package com.akash.hackerrank;
import java.util.Scanner;
public class Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=10;
        int a=0;
        int b=2;
        for(int j=1;j<n;j++){
            int r=0;
            for(int k=0;k<=j;k++){
                r=r+(int)Math.pow(2,k)*b;
            }
            System.out.print((a+r)+" ");
        }
    }
}
