package com.akash;
import java.util.*;
public class SwapNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int c=0;
        System.out.println("Before "+m+" "+n);
        c=m;
        m=n;
        n=c;
        System.out.println("After "+m+" "+n);
    }
}
