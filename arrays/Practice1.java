package com.akash.arrays;
//finding sum of all elements in arrays

public class Practice1 {
    public static void main(String[] args) {
        int arr[]={1,3,5,7};
        int f=0;
        for (int i=0;i<arr.length;i++){
            f=f+arr[i];
        }
        System.out.println(f);
    }
}
