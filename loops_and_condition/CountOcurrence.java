package com.akash.loops_and_condition;
import java.util.Scanner;
public class CountOcurrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem;
        int i=0;
        while(n>0){
            rem=n%10;
            if (rem==3){
                i++;
            }
            n=n/10;
        }
        System.out.println(i);
    }
}
