package com.akash.arrays;
import java.util.*;

public class KadaneAlgoNegativeNo {
    public static void main(String[] args) {
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        subarr(num);
    }
    public static void subarr(int num[]){
        int MaxSum=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i< num.length;i++){
            curr=Math.max(num[i],num[i]+curr);
            if(curr>MaxSum){
                MaxSum=curr;
            }
        }
        System.out.println("max sum of subarray: "+MaxSum);
    }
}
