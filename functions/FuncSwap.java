package com.akash.functions;

public class FuncSwap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        Swap(a,b);

    }
    public static void Swap(int n,int m){
        int temp=0;
        temp=n;
        n=m;
        m=temp;
        System.out.println(n+" "+m);
    }
}
