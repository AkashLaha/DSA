package com.akash.arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int num[]={10,12,22,56,68,70};
        int key=23;
        int val=check(num,key);
        if(val==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("the key value is in index "+val);
        }
    }
    public static int check(int num[],int key){
        int start=0,end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
