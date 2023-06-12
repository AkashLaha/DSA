package com.akash.arrays;
//searching for an element

public class Practice2 {
    public static void main(String[] args) {
        int arr[]={4,6,5,11,12,10};
        int i=0;
        int key=90;
        for (i=0;i<arr.length;i++){
            if(key==arr[i]){
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println("not found");
    }
}
