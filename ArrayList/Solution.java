package com.akash.ArrayList;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(ArrayList<Integer> arr) {
        // Write your code here
        // create a DecimalFormat object to format the result
        double negcount=0;
        double poscount=0;
        double noncount=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<0){
                negcount++;

            }
            else if(arr.get(i)>0){
                poscount++;
            }
            else{
                noncount++;

            }
        }
        double neg=negcount/5;
        double pos=poscount/5;
        double non=noncount/5;
        System.out.format("%.6f",pos);
        System.out.println();
        System.out.format("%.6f",neg);
        System.out.println();
        System.out.format("%.6f",non);
    }

}

public class Solution {
    public static void main(String[] args){
        // to represent the table

        // add the first row to the table
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-1);


        // get the value at row 1, column 2
        Result.plusMinus(arr);
    }
}

