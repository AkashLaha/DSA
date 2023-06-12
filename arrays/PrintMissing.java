package com.akash.arrays;

public class PrintMissing {
    public static void main(String[] args) {
        int n=7;
        int arr[]={2,3,4,1,7,2};
        int k=arr.length;
        for(int i=1;i<=n;i++){
            int count=0;
            int j=0;
            while(j<k){
                if(i==arr[j]){
                    count++;
                    break;
                }
                else{

                    j++;

                }
            }
            if(count==0){
                System.out.println(i);
            }
        }
    }

}
