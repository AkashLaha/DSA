package com.akash.leetcode;

public class RemoveDulicate {
    public static void main(String[] args) {
        int nums[]={1,1,2};
        int k=0;
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            while(j<nums.length){
                if(nums[j]!=nums[i]){
                    nums[k]=nums[j];
                    k++;
//                    System.out.println(nums[k]);
                }
                j++;
            }
        }
        System.out.println(k);
    }
}
