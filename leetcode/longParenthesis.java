package com.akash.leetcode;

import java.util.Stack;

public class longParenthesis {
    public static void main(String[] args) {
        String str="()()()))))()()()()()()";
        int d=longestValidParentheses(str);
        System.out.println(d);
    }
    public static int longestValidParentheses(String str) {
        Stack<Character>s=new Stack<>();
        int count=0;
        int vcount=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                vcount++;
            }
        }
        return count;
    }
}
