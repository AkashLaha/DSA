package com.akash.leetcode;

import java.util.*;
class Solution {
    public static int maxSubArray(int[] nums) {
        int lar=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){

            for(int j=i;j<nums.length;j++){
                int c=0;
                for(int k=i;k<=j;k++){
                    c=c+nums[k];

                }
                if(lar<c){
                    lar=c;
                }
            }
        }
        return lar;
    }
    public static void main(String args[]){
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int index=maxSubArray(nums);
        System.out.println(index);
    }
}
