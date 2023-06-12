package com.akash.arrays;

import java.util.*;
//kadane algo for finding the max possible sum of subarrays
public class KadaneAlgo {
    public static void main(String[] args) {
        int num[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of elements: ");
        int n=sc.nextInt();
        System.out.println("the elements: ");
        for(int i=0;i< num.length;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("elemnts are: ");
        for(int i=0;i< num.length;i++){
            System.out.println(num[i]);
        }
        Algo(num);
    }
    public static void Algo(int num[]){
        int lar=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i< num.length;i++){
            curr=curr+num[i];
            if(curr<0){
                curr=0;
            }
            lar=Math.max(curr,lar);
        }
        System.out.println("max sum: "+lar);

    }
}
