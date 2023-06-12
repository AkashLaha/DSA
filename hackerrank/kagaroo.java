package com.akash.hackerrank;

public class kagaroo {
    public static void main(String[] args) {
        int x1=21;
        int v1=6;
        int x2=47;
        int v2=3;
        String s=kangaroo(x1,v1,x2,v2);
        System.out.println(s);
    }
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        if(x2>x1 && v2>v1){
            return "NO";
        }
        else if(x1>x2 && v1>v2){
            return "NO";
        }
        if((float) Math.abs(x2-x1)%Math.abs(v2-v1)==0){
            return "YES";
        }
        else{
            return "NO";
        }

    }
}
