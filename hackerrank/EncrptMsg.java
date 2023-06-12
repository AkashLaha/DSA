package com.akash.hackerrank;

public class EncrptMsg {
    public static void main(String[] args) {
        String msg="welcome to hackerrank";
        String str1="";
        String str2="";
        String str3="";
        String str4="";
        int spaceIndex=0;
        int i=0;
        while(msg.charAt(i)!=' '){
            str1+=msg.charAt(i);
            i++;
        }
        i=i+1;
        while(msg.charAt(i)!=' '){
            str2+=msg.charAt(i);
            i++;
        }
        for(i=i+1;i<msg.length();i++){
            str3+=msg.charAt(i);
        }
        str4=str3+" "+str2+" "+str1;
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
        System.out.println(str4);
    }
}
