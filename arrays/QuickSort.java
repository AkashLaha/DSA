package com.akash.arrays;

public class QuickSort {
    public static void main(String[] args) {
        int num[]={6,3,9,5,2,8};
        int n=num.length;
        Sort(num,0,n-1);
        for (int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    public static void Sort(int num[],int low,int high){
        if(low<high){
            int pivot=partition(num,low,high);

            Sort(num,low,pivot-1);
            Sort(num,pivot+1,high);
        }
    }
    public static int partition(int num[],int low,int high){
        int pivot=num[high];
        int i=low-1;
        for(int j=low; j<high; j++){
            if(num[j]<pivot){
                i++;
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
            }
        }
        i++;
        int temp=num[i];
        num[i]=pivot;
        num[high]=temp;
        return i;

    }
}
