package com.akash.loops_and_condition;
import java.util.*;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int empid=sc.nextInt();
        String dep=sc.next();
        switch(empid){
            case 1:
                System.out.println("aka");
                break;
            case 2:
                System.out.println("laha");
                break;
            case 3:
                switch(dep){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "hotel":
                        System.out.println("hotel management");
                        break;
                    default:
                        System.out.println("invalid");
                }
                break;
            default:
                System.out.println("invalid id");
        }
    }
}
