package com.akash.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxKPairs {
    public static void main(String[] args) {
        int nums[]={4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        Arrays.sort(nums);
        int count=0;
        int n=2;
        int i=0;
        int j= nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]==n){
                count++;
                i++;
                j--;
            } else if (nums[i]+nums[j]>n) {
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println(count);
    }
}
