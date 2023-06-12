package com.akash;
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().trim().charAt(0);
        //trim() removes whitespace or space before a string
        //charAt(0) means char at index value in string
        //charAt() returns in char type
        if (ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
