package com.akash.loops_and_condition;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%400==0){
            System.out.println("Leap Year");
        }
        else if (n%4==0 && n%100!=0) {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
