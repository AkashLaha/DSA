package com.akash.functions;

public class DectoBin {
    public static void main(String[] args) {
        Fun(11);

    }
    public static void Fun(int n){
        String b="";
        int f=0;
        while(n>0){
            f=n%2;
            n=n/2;
            b=f+b;

        }
        System.out.print(b);

    }
}
