package com.akash.ArrayList;
import java.util.*;
public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            int temp=sc.nextInt();
            //checks if list arrlst does not contain an elem equal to temp int,it returns boolean
            if(!list.contains(temp)){
                list.add(temp);
            }
        }
        Collections.sort(list);//sorts all the elems in the array list
        System.out.println(list);
    }
}
