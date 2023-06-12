package com.akash.loops_and_condition;
import java.util.Scanner;
public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0,a;
        while(n>0){
            a=n%10;
            n=n/10;
            rev=rev*10+a;
        }
        System.out.println(rev);
    }
}
