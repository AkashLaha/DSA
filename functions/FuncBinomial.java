package com.akash.functions;

public class FuncBinomial {
    public static void main(String[] args) {
        int s=bino(5,2);
        System.out.println(s);
    }
    static int bino(int n, int r){
        int f=1;
        int e=1;
        int g=1;
        int h;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        for(int j=1;j<=r;j++){
            e=e*j;
        }
        for(int k=1;k<=(n-r);k++){
            g=g*k;
        }
        h=f/(e*g);
        return h;
    }
}
