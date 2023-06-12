package com.akash.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class divPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=100;
        int k=22;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        Arrays.sort(arr);
        for(int i=0;i< arr.length-1;i++){
            int sum=0;
            int j=i+1;
            while(j<arr.length){
//                if(arr[i]<arr[j]){
                    sum=arr[i]+arr[j];
                    if(sum%k==0){
                        count++;
                    }
                    j++;
//                }
//                else{
//                    j++;
//                }
            }
        }
        System.out.println(count);
    }
}
