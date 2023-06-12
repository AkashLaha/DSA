package com.akash.leetcode;

import java.util.*;
public class Minions {
    public static void main(String[] args) {
        int heights[]={10,6,8,5,11,9};
        int[] s=canSeePersonsCount(heights);
        for(int i=0;i<heights.length;i++){
            System.out.println(s[i]);
        }
    }
    public static int[] canSeePersonsCount(int[] heights) {
        int count=0;
        Stack<Integer> st=new Stack<>();
        int arr[]=new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            count=0;

            if(st.isEmpty()){
                st.push(heights[i]);
                count=0;
                arr[i]=count;
            }
            else{
//                while(!st.isEmpty() && st.peek<heights[i]){
//                    st.pop();
//                    count++;
//                }
//                st.push(heights[i]);
//                arr[i]=count;
                if(st.peek()<heights[i]){
                    st.pop();
                    st.push(heights[i]);
                    count++;
                    if(st.peek()>heights[i]){
                        count++;
                        arr[i]=count;
                    }
                    else{
                        arr[i]=count;
                    }

                }
                else{
                    st.push(heights[i]);
                    count++;
                    arr[i]=count;
                }
            }
        }
        return arr;
    }
}
