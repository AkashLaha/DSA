package com.akash.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class candles {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList <Integer> candles=new ArrayList<>();
        for(int i=0;i<1000;i++){
            int a=sc.nextInt(i);
            candles.add(a);
        }
        Collections.sort(candles);
        System.out.println(candles);
        int count=1;
        for(int i=candles.size()-2;i>=0;i--){
            if(candles.get(candles.size()-1)==candles.get(i))
                count++;
        }
        System.out.println(count);
    }
}
