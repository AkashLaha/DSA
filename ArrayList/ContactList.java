package com.akash.ArrayList;

import java.util.*;
public class ContactList {
    public static void main(String[] args) {
        String haystack="sadbutsad";
        String needle="but";
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,needle.length()+i).equals(needle)){
                    System.out.println(i);
                }
            }
            else{
                System.out.println("-1");
            }
        }
    }
}
