package com.akash;
import java.util.*;
public class Typecasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //$the source type (datatype at LHS) should be larger
        //$as float can take both int and float value so it is larger
        //float a=sc.nextInt();
        //System.out.println(a);

        //$Typecasting
        //int num=(int)(27.22f);
        //System.out.println(num);

        //$automatic type promotion of expression
        //int b=257;
        //$for byte 256 is the max value it can store, if the value is bigger than 256 it gives remainder
        //byte c=(byte)(b);//257%256=1
        //System.out.println(c);

        //byte j=40;
        //byte k=50;
        //$j*k is 2000 so it exceeds the byte value, but in java arithmetic operation done in int so it can store the value
        //int l=j*k/100;
        //System.out.println(l);

        //byte bb=40;
        //$as bb*2 is in int how can it store it in byte so it shows error
        //bb=bb*2;

        //if use char in int it will give the asci value
        int n='A';
        System.out.println(n);

        //in unicode is used so u can print languages also
        System.out.println("नमस्ते");
    }
}
