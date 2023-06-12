package com.akash.gfg;

import java.util.Arrays;

public class equalArrays {
    public static void main(String[] args) {
        int n=4;
        int arr[]={1,2,4,3};
        int arr2[]={3,2,4,1};
        boolean c=check(arr,arr2,4);
        if(c==true){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
    public static boolean check(int[] arr,int[] arr2,int n ){
//        int a=0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j< arr2.length;j++){
//                if(arr[i]==arr2[j]){
//                    a++;
//                }
//            }
//        }
//        if(a< arr.length){
//            return false;
//        }
//        else{
//            return true;
//        }
        //for O(N)
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }

}
