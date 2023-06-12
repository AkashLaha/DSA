package com.akash.leetcode;

public class sizeOfLast {
    public static void main(String[] args) {
//       String s="   fly me   to   the moon  ";
//        String s="Hello World";
        String s="a";
        int count=0;
        int i=s.length()-1;
        while(i>=0){
            if(s.charAt(i)==' '){
                if(count==0){
                    i--;
                }
                else {
                    break;
                }
            }
            if(s.charAt(i)!=' '){
                count++;
                i--;
            }
        }
        System.out.println(count);
    }
}
