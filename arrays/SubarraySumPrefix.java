package com.akash.arrays;
//Calculate subarray sum using prefix formula
public class SubarraySumPrefix {
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        subarr(num);
    }
    public static void subarr(int num[]) {
        int ts = 0;
        int lar = Integer.MIN_VALUE;
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        for (int i = 0; i < num.length; i++) {
            //start=i;
            for (int j = i; j < num.length; j++) {
                int c = i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                //end=j;
                if (lar < c) {
                    lar = c;
                }

            }
        }
        System.out.println("largest sum: " + lar);
    }
}
