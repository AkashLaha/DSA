package com.akash.loops_and_condition;
import java.util.*;
public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a: ");
        char a=sc.next().charAt(0);
        System.out.println("enter b: ");
        char b=sc.next().charAt(0);
        System.out.println("choose operator: ");
        char c=sc.next().charAt(0);
        switch (c){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(b!=0){
                    System.out.println(a/b);
                }
                else{
                    System.out.println("invalid");
                }
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Wrong Operator");
        }
    }
}
