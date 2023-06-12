package com.akash.arrays;

public class BubbleSort {
    public static void main(String[] args) {
       int arr[]={7,2,4,1,6};
       for(int turns=0;turns<arr.length-1;turns++){
           for(int i=0;i< arr.length-1-turns;i++){
              if(arr[i]>arr[i+1]) {
                  int temp = arr[i];
                  arr[i] = arr[i + 1];
                  arr[i + 1] = temp;
              }
           }
       }
       for(int i=0;i< arr.length;i++){
           System.out.print(+arr[i]+" ");
       }
    }
}
