package com.akash.leetcode;

import java.util.*;
public class longestSubString {
    public static void main(String[] args) {
        String s="abcabcbb";
        ArrayList<Character> ch=new ArrayList<>();
        int l=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            while(ch.contains(s.charAt(i))){
                ch.remove(0);
                l++;
            }
            ch.add(s.charAt(i));
            ans=Math.max(ans,i-l+1);
        }
        System.out.println(ans);
    }
}
