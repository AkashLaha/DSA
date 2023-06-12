package com.akash;

import java.util.Scanner;

public class SwapnoWthout {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Before "+m+" "+n);
        m=m+n;
        n=m-n;
        m=m-n;
        System.out.println("After "+m+" "+n);
    }
}
