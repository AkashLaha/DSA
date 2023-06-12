package com.akash.functions;

public class FuncPrime {
    public static void main(String[] args) {
        boolean s=prime(10);
        PrimeRange(15 );
        System.out.println(s);
    }
    public static boolean prime(int n){
        boolean isprime=true;
        if(n==2){
            isprime=true;
        }
//        for(int i=2;i<=n-1;i++){
//            if(n%i==0){
//                isprime=false;
//                break;
//            }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        return isprime;
    }

    // Prime in Range
    public static void PrimeRange(int n){
        for(int i=2;i<=n;i++){
            if(prime(i)==true){
                System.out.println(i);
            }
        }
    }
}
