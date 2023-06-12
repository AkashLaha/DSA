package com.akash.arrays;

//sorting an Array
public class Practice4 {
    public static void main(String[] args) {
        String s[]={"python","java","css","angular","fotran"};
        java.util.Arrays.sort(s);
        for (int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
