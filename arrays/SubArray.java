package com.akash.arrays;

public class SubArray {
    public static void main(String[] args) {
        int num[] = {2 ,5 ,1 ,3 ,4 ,4 ,3 ,5 ,1 ,1 ,2 ,1 ,4 ,1 ,3 ,3 ,4 ,2 ,1};
        subarr(num);
    }
    public static void subarr(int num[]){
        int ts=0;
        int lar=Integer.MIN_VALUE;
        int sm=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            //start=i;
            for(int j=i;j<num.length;j++){
                int c=0;
                //end=j;
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]+" ");
                    c=c+num[k];
                    ts++;
                }
                System.out.println();
                System.out.println("sum is "+c);
                if(lar<c){
                    lar=c;
                }
                if(sm>c){
                    sm=c;
                }
            }
            System.out.println();
        }
        System.out.println("largest sum: "+lar);
        System.out.println("smallest sum: "+sm);
        System.out.println("total no. of subarray: "+ts);
        //formula for total no. of subarrays is n(n+1)/2
  }

//        public static void subarr(int arr[]){
//            int t=0;
//
//            int lar=Integer.MIN_VALUE;
//            for(int i=0;i<arr.length;i++){
//                int start=i;
//                for(int j=i;j<arr.length;j++){
//                    int c=0;
//                    int end=j;
//                    for(int k=start;k<=end;k++){
//
//                        c=c+arr[k];
//                        System.out.print("["+arr[k]+"]");
//                    }
//                    if(lar<c){
//                        lar=c;
//                    }
//                    System.out.println();
//                    t++;
//                }
//            }
//            System.out.println(lar);
//            System.out.println(t);
//
//        }
}
