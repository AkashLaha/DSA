package com.akash.arrays;
//SecondLargestNUmber

import java.util.*;
public class Practice3 {
    public static void main(String[] args) {
        int arr[]={3,5,4,6,11,18};
        int lar1=arr[0];
        int lar2=arr[0];
        for(int i=0;i<arr.length;i++){
            if(lar1<arr[i]){
                lar2=lar1;
                lar1=arr[i];
            } else if (lar2<arr[i]) {
                lar2=arr[1];
            }
        }
        System.out.println(lar2);
    }
}
