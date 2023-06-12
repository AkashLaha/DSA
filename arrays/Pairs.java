package com.akash.arrays;

public class Pairs {
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        pair(num);

    }
    public static void pair(int num[]) {
        int tp=0;
        for (int i = 0; i < num.length; i++) {
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+num[i]+","+num[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.print("total no. of pairs: "+tp);
        //formula for finding total pairs n(n-1)/2
    }

}
