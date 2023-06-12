package com.akash.arrays;
import java.util.*;
public class TrappedRainWater {
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trapped(height));
    }
    public static int trapped(int[] height){
        //Calculate leftmax boundary
        int n= height.length;
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i< n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1] );
        }
        //Calculate rightmax boundary
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1] );
        }
        //loop for min of leftmax and rightmax
        int trappedwater=0;
        for(int i=0;i<n;i++){
            //waterlevel
            int waterlevel=Math.min(leftmax[i],rightmax[i] );
            trappedwater=trappedwater+waterlevel-height[i];
        }
        return trappedwater;
    }
}
