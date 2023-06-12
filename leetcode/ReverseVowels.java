package com.akash.leetcode;

import java.util.ArrayList;

public class ReverseVowels {
    public static void main(String[] args) {
        String str = "hello";
        String s = "";
//        ArrayList<Character> ch=new ArrayList<>();
//        for(int i=0;i<str.length();i++){
//            char chr=str.charAt(i);
//            if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u'||chr=='A'||chr=='E'||chr=='I'||chr=='O'||chr=='U'){
//                ch.add(chr);
//            }
//        }
//        int i=0;
//        int j= ch.size()-1;
//        char temp='a';
//        while(i<j){
//            temp = ch.get(i);
//            ch.set(i, ch.get(j));
//            ch.set(j, temp);
//            i++;
//            j--;
//            //u cant assign char values directly in java so we have used this way to do it
//            //    This line sets the character at index i in the ArrayList ch to the character value at index j.
//            //    It effectively swaps the character at index i with the character at index j.
//            //    This line sets the character at index j in the ArrayList ch to the value stored in the temp variable.
//            //    It completes the swapping by assigning the original character value of index i to index j.
//        }
//        int k=0;
//        int h=0;
//        StringBuilder sb = new StringBuilder(str);
//
//        while (k < sb.length()) {
//            char chr = sb.charAt(k);
//            if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u' || chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U') {
//                sb.setCharAt(k, ch.get(h));
//                h++;
//            }
//            k++;
//        }
//
//        str = sb.toString();
//        System.out.println(str);

        int n=str.length();
        char arr[]=str.toCharArray();//converts str into array
        int start=0;
        int end=n-1;
        while(start<end){
            if(!isVowel(arr[start])){
                start++;
            } else if (!isVowel(arr[end])) {
                end--;
            }
            else{
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        String.valueOf(arr);//converts the arr in string
        System.out.println(arr);

    }
    public static boolean isVowel(char a){
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
            return true;
        }
        else{
            return false;
        }
    }
}
