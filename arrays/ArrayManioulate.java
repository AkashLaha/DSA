package com.akash.arrays;

public class ArrayManioulate {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minidx=0;
        int maxidx=0;
        int ans=0;
        int arr[]={20,50,30,80,70};
        int k=2;
//        int arr[]={10,10,10};
//        int k=1;
        for( int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
                minidx=i;
            }
            if(max<arr[i]){
                max=arr[i];
                maxidx=i;
            }
        }
        if(arr[k-1]==arr[maxidx] && arr[k-1]==arr[minidx]){
            System.out.println(ans);
        }
        else if(arr[k-1]==arr[minidx]){
//            int temp=arr[maxidx];
//            arr[maxidx]=arr[k-1];
//            arr[k-1]=temp;
            ans=swap(maxidx,k-1,arr);
//            ans=arr[k-1]*arr[maxidx];

            System.out.println(ans);
        }
        else if(arr[k-1]==arr[maxidx]){
            System.out.println(ans);
        }
        else{

//            int temp=arr[minidx];
//            arr[minidx]=arr[k-1];
//            arr[k-1]=temp;
//            ans=arr[k-1]*arr[minidx];
            ans=swap(minidx,k-1,arr);


//            int temp2=arr[maxidx];
//            arr[maxidx]=arr[k-1];
//            arr[k-1]=temp2;
//            ans=ans+arr[k-1]*arr[maxidx];
            ans=swap(maxidx,k-1,arr)+ans;

//            int temp3=arr[maxidx];
//            arr[maxidx]=arr[minidx];
//            arr[minidx]=temp3;
//            ans=ans+arr[minidx]*arr[maxidx];
            ans=swap(maxidx,minidx,arr)+ans;

            System.out.println(ans);
        }
    }
    public static int swap(int idx1,int idx2,int[] arr){
        int ans=0;
        int temp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
        ans=arr[idx2]*arr[idx1];
        return ans;
    }
}
