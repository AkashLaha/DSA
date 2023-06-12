package com.akash.leetcode;

import java.util.*;
public class GreatestNumCandy {
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extraCandies=3;
        List<Boolean> arr=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int mx=0;
        for(int i=0;i<candies.length;i++){
            mx=Math.max(mx,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=mx){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }
        System.out.println(arr);
    }
}
