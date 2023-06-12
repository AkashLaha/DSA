package com.akash.functions;

public class TrailingZeroes {

        /*count = 0
        i = 5

        while n // i >= 1:
            count += n // i
            i *= 5
        return count*/
    public static void main(String[] args) {
        int n=377;
        System.out.println(Count(n));
    }
    public static int Count(int n){
        int count=0;
        int i=5;
        while(n/i>=1){
            count += n/i;
            i *= 5;
        }
        return count;
    }
}
