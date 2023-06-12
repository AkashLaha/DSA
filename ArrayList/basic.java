package com.akash.ArrayList;

import java.util.*;
public class basic {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//
//        //add
//        list.add(0);
//        list.add(1);
//        list.add(2);
////        System.out.println(list);
//
//        //get
//       int elem=list.get(0);
//        System.out.println(elem);
//
//        //add in betn
//        list.add(1,1);
//        System.out.println(list);
//
//        //replace a element
//        list.set(0,5);//element at 0 index will change into 5
//        System.out.println(list);
//
//        //delete elem
//        list.remove(3);
//        System.out.println(list);
//
//        //get size of arraylist
//        int size=list.size();
//        System.out.println(size);

        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        int a=1;
        while(a>0){
            a=sc.nextInt();
            if(a>=0)
                arr.add(a);
            else{
                break;
            }
        }
        for(int i=arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i)+" ");
        }
    }
}
