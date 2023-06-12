package com.akash.functions;

public class FuncFactorial {
    public static void main(String[] args) {
        int g=bin(5,2);
        System.out.println(g);
    }
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;

        }
        return f;
    }
    public static int bin(int n, int r){
        int s=fact(n);
        int k=fact(r);
        int v=fact(n-r);
        int bc=s/(k*v);
        return bc;
    }
}
