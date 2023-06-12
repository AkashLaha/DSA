package com.akash.leetcode;

import java.util.ArrayList;

public class MergeStrings {
    public static void main(String[] args) {
        String word1="ab";
        String word2="pqrs";
        ArrayList<Character> ch=new ArrayList<>();
        String str="";
        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
            if (i < word1.length()) {
                ch.add(word1.charAt(i));
            }
            if (i < word2.length()) {
                ch.add(word2.charAt(i));
            }
        }
        for(int i=ch.size()-1;i>=0 ;i--){
            str=ch.get(i)+str;
        }
        System.out.println(str);
    }
}
