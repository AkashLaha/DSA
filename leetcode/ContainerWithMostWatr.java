package com.akash.leetcode;

public class ContainerWithMostWatr {
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        int result=0;
        int mx=Integer.MIN_VALUE;
//        for(int i=0;i< height.length;i++){
//            for(int j=i+1;j<height.length;j++){
//                int max=Math.max(height[i],height[j]);
//                int min=Math.min(height[i],height[j]);
//                result=min*(j-i);//height will be the min of arr[i] and arr[j], width will be the difference betn the
//                // index i and j
//                if(result>mx){
//                    mx=result;
//                }
//            }
//        }
//        return mx;

        //Optimized Code
        int i=0;
        int j=height.length-1;
        while(i<j){
            int min=Math.min(height[i],height[j] );
            result=min*(j-i);
            if(result>mx){
                mx=result;
            }
            if(height[i]==min){
                i++;
            }
            else {
                j--;
            }
            //we are incre and decre only min because if we incre decre min than only there is a possibility that
            // next height might be maximum then min if it is max than the area will incre. If we incre decre the max
            // the even if we get maximum or minimum height then max the area will decrease.
        }
        System.out.println(mx);
    }
}
