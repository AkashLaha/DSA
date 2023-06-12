package com.akash.arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        rev(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void rev(int arr[]){
       int temp;
       int start=0;
       int end=arr.length-1;
       while(start<end){
           temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }

    }
}
