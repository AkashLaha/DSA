package com.akash.hackerrank;

public class ChocolateBar {
    public static void main(String[] args) {
        int m=7;
        int d=18;
       int arr[]={2 ,5 ,1 ,3 ,4 ,4 ,3 ,5 ,1 ,1 ,2 ,1 ,4 ,1 ,3 ,3 ,4 ,2 ,1};
//        int arr[]={4};
        int count=0;
        int sum=0;
        for(int i=0;i<=arr.length-m;i++){
            for(int j=i;j<i+m;j++){
                sum=sum+arr[j];
            }
            if(sum==d){
                count++;
            }
            sum=0;


        }
        System.out.println(count);
    }
}
