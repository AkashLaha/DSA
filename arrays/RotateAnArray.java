package com.akash.arrays;

import java.util.*;
public class RotateAnArray {
    public static void main(String[] args){
//        Scanner sc= new Scanner(System.in);
//        int k=sc.nextInt();
//        int n=sc.nextInt();
//        int nums[]=new int[n];
//        for(int i=0;i<nums.length;i++){
//            nums[i]=sc.nextInt();
//        }
//        rotate(nums,k);
//        display(nums);
        int arr[]={1,2,3,4,5};
        int k=2;

        for(int i=1;i<=k;i++){
            int j;
            int lst=arr[0];
            for(j=0;j<arr.length-1;j++){
               int temp=arr[j+1];
               arr[j+1]=arr[j];
               arr[j]=temp;
            }
            arr[j]=lst;
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }
//    public static void rotate(int[] nums, int k) {
//
//        k=k%nums.length;
//        if(k<0){
//            k=k+nums.length;
//        }
//            reverse(nums,0,nums.length-k-1);
//            reverse(nums,nums.length-k,nums.length-1);
//            reverse(nums,0,nums.length-1);
//    }
//    public static void reverse(int[] nums,int i,int j){
//        while(i<j){
//            int temp=nums[i];
//            nums[i]=nums[j];
//            nums[j]=temp;
//
//            i++;
//            j--;
//        }
//    }
//    public static void display(int[] nums){
//        for(int i=0;i<nums.length;i++){
//            System.out.println(nums[i]);
//        }
//    }
}
