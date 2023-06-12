package com.akash.loops_and_condition;

public class Armstrong {
    public static void main(String[] args) {
        int n=371;
        double t,a,sum=0;
        t=n;
        while(n!=0) {
            a = n % 10;
            n = n / 10;
            sum=sum+Math.pow(a,3);
        }
        if(sum==t){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("invalid");
        }
    }
}
