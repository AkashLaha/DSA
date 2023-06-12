package com.akash.hackerrank;

import java.util.*;
public class AlphaNum {
    public static void main(String[] args) {
        String str="123abc34abbcv";

        int Max=Integer.MIN_VALUE;
        int count=0;
        String newString="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(Character.isAlphabetic(str.charAt(i))==true){
                count++;

                if(Max<count){
                    Max=count;
                    newString+=str.charAt(i);
                }
            }
            else{
                count=0;
                continue;
            }
        }
        System.out.println(newString);
    }
}
