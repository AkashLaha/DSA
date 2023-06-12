package com.akash.leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int val=3;
        int i=0;
        int j=0;
        while(j<nums.length) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
//            System.out.println(nums[i]);
            j++;
        }
        System.out.println(i);


    }
}
