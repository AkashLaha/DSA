package com.akash;

public class Strings {
    public static void main(String[] args) {
        String name="bro";
        boolean result=name.equals("bro");
        //.equals() will compare the string of the var written before dot with the string inside the ().
        //in name.equals, name is the var where the first string is stored
        boolean a=name.equalsIgnoreCase("Bro");
        //it will ignore lowercase or uppercase of the string inside the ()
        int b= name.length();
        // gives the length of the string
        char ch=name.charAt(3);
        //access the character of string by specifying the index value which starts from 0
        int z= name.indexOf("r");
        //index of the specified char of the string
        boolean r=name.isEmpty();
        //returns true or false if u have specified any string in the name var
        String str=name.toUpperCase();
        //returns string in uppercase, same goes for lowercase
        String c=name.trim();
        //removes any empty space before nad after string
        String d=name.replace("b","a");
        //replace a char of a string
        System.out.println(result);
    }
}
