package com.akash.ArrayList;
import java.util.*;
public class menuProgram {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose a num: ");
        int a=sc.nextInt();
        if(a==1){
            System.out.print("enter a num: ");
            int b=sc.nextInt();
            list.add(b);
        }
        else if (a==2) {
            System.out.print("enter the num to remove ");
            int c=sc.nextInt();
            list.remove(c);
        }
        else if (a==3) {
            System.out.print(list);
        }
        else{
            System.out.println("exit");
        }
    }
}
