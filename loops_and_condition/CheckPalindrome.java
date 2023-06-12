package com.akash.loops_and_condition;

public class CheckPalindrome {
    public static void main(String[] args) {
        int n=123;
        int a,i=0,pal=0;
        i=n;
        while(n<0){
            a=n%10;
            n=n/10;
            pal=pal*10+a;
        }
        if(i==pal){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
