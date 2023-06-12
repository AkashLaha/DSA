package com.akash.hackerrank;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class areaofaWord {
    public static void main(String[] args) {
        int[] arr={1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        String str="abc";
        int count=0;
        int max=Integer.MIN_VALUE;
        ArrayList<Character> list=new ArrayList<>();
        ArrayList<Character>letter=new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            letter.add(c);
        }
        for(int i=0;i<str.length();i++){
            list.add(str.charAt(i));
        }
        for(int i=0;i< list.size();i++){
            int idx=letter.indexOf(list.get(i));
            if(arr[idx]>max){
                max=arr[idx];
            }
        }
        System.out.println(max* list.size()*1);

    }

}
