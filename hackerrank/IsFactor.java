package com.akash.hackerrank;

import java.util.ArrayList;
//https://www.hackerrank.com/challenges/between-two-sets/problem?h_r=next-challenge&h_v=zen&isFullScreen=false

public class IsFactor {
    public static void main(String[] args) {
        int n=2;
        int m=2;
        int farr[]={3,4};
        int sarr[]={24, 48};
        int count=0;
        int newCount=0;
        int fcount=0;
        ArrayList<Integer> arr=new ArrayList<>();

        for(int i=1;i<=sarr[0];i++){
            for(int j=0;j< farr.length;j++){
                if(i%farr[j]==0){
                    fcount++;
                }
                if(fcount==n){
                    arr.add(i);
                }
            }
            fcount=0;
        }
        System.out.println(arr);
        for(int i=0;i<arr.size();i++){
            for(int j=0;j< sarr.length;j++){
                if(sarr[j]%arr.get(i)==0){
                    count++;
                }
                if(count==m){
                    newCount++;
                }
            }
            count=0;

        }
        System.out.println(newCount);
    }
}
