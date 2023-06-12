package com.akash.functions;

public class FuncBintoDec {
    public static void main(String[] args) {
        int s=Fun(101);
        System.out.println(s);
    }
    public static int Fun(int n){
        int dec=0;
        int pow=0;
        while(n>0){
            int f=n%10;
            dec=dec+f*(int)Math.pow(2,pow);
            pow++;
            n=n/10;
        }
        return dec;
    }
}
