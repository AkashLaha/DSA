package com.akash.loops_and_condition;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        int c = 0;
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        while (true) {
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%'){
                System.out.println("enter a and b: ");
                int a=sc.nextInt();
                int b=sc.nextInt();
                if(ch=='+'){
                    c=a+b;
                    System.out.println(c);
                    break;
                }
                if (ch=='-') {
                    c=a-b;
                    System.out.println(c);
                    break;
                }
                if (ch=='*') {
                    c=a*b;
                    System.out.println(c);
                    break;
                }
                if (ch=='/') {
                    if(b!=0) {
                        c = a / b;
                        System.out.println(c);
                    }
                    else{
                            System.out.println("invalid");
                        }
                        break;

                }
                else{
                    c=a%b;
                    System.out.println(c);
                    break;
                }

            }
            else {
                System.out.println("Invalid");
            }
        }

//    int c=0;
//    Scanner sc=new Scanner(System.in);
//    System.out.println("enter operator: ");
//    char op=sc.next().trim().charAt(0);
//    if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
//        System.out.println("enter a and b: ");
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        if(op=='+'){
//            c=a+b;
//            System.out.println(c);
//        }
//        else if (op=='-') {
//            c=a-b;
//            System.out.println(c);
//        }
//        else if (op=='*') {
//            c=a*b;
//            System.out.println(c);
//        }
//        else if (op=='/') {
//            if(b!=0){
//                c=a/b;
//                System.out.println(c);
//            }
//        }
//        else{
//            c=a%b;
//            System.out.println(c);
//        }
//
//    }
//    else {
//          System.out.println("Invalid");
//    }
    }
}

