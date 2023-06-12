package com.akash.leetcode;

public class GreatestCommon {
    public static void main(String[] args) {
        String str1="ABABABAB";
        String str2="ABAB";
        String s="";
        if((str1+str2).equals(str2+str1)){
            int f=findGCD(str1.length(),str2.length());
            s=str1.substring(0,f);
            System.out.println(s);
        }
        else {
            System.out.println("");
        }
    }
    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
