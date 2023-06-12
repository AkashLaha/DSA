package com.akash.loops_and_condition;
import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //String fr=sc.next();
        //THis enhanced version of switch, for enhancing press alt+enter.
//        switch (fr) {
//            case "apple" -> System.out.println("red fruit");
//            case "mango" -> System.out.println("king of fruit");
//            case "orange" -> System.out.println("round fruit");
//            default -> System.out.println("enter valid value!!!");
//        }


//        //Days of a week
//        int day=sc.nextInt();
//        switch(day){
//            case 1:
//                System.out.println("monday");
//                break;
//            case 2:
//                System.out.println("tueday");
//                break;
//            case 3:
//                System.out.println("wednesday");
//                break;
//            case 4:
//                System.out.println("thursday");
//                break;
//            case 5:
//                System.out.println("friday");
//                break;
//            case 6:
//                System.out.println("saturday");
//                break;
//            case 7:
//                System.out.println("sunday");
//                break;
//            default:
//                System.out.println("invalid input!!!!!");
//        }


        //Weekday and Weekends
        int d=sc.nextInt();
        switch(d){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekends");
                break;
            default:
                System.out.println("invalid input!!!!!");
        }
    }
}
