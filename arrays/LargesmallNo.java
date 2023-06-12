package com.akash.arrays;

public class LargesmallNo {
    public static void main(String[] args) {
        int num[]={3,2,5,4};
        System.out.println("the largest no. "+check(num));
    }
    public static int check(int num[]){
        int lar=Integer.MIN_VALUE;
        int sm=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>lar){
                lar=num[i];
            }
            if(num[i]<sm){
                sm=num[i];
            }
        }
        System.out.println("the smallest no. "+sm);
        return lar;
    }
}
