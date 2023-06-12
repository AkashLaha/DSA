package com.akash.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int apcount=0;
        int orcount=0;
        for(int i=0;i<apples.size();i++){
            int sum=a+apples.get(i);
            if(sum>=s&&sum<=t){
                apcount++;
            }
        }
        System.out.println(apcount);
        for(int i=0;i<oranges.size();i++){
            int sum=b+oranges.get(i);
            if(sum>=s&&sum<=t){
                orcount++;
            }
        }
        System.out.println(orcount);
    }

}

public class Solution {
    public static void main(String[] args) {
        int s=2;
        int t=3;
        int a=1;
        int b=5;
        int n=1;
        int m=1;
        List <Integer> apples=new ArrayList<>();
        for(int i=0;i<n;i++){
            apples.add(2);
        }
        List <Integer> oranges=new ArrayList<>();
        for (int i=0;i<m;i++){
            oranges.add(-2);
        }
        Result1.countApplesAndOranges(s,t,a,b,apples,oranges);

    }
}

