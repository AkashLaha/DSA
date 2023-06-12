package com.akash;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,44,55,66,77,8);// u can use zero or more arguments
        func(2,3,"a","d","c");//value should be in order of the arguments
    }
    static void fun(int ...arr){
        System.out.println(Arrays.toString(arr));
    }
    static void func(int a,int b,String ...v){
        //var args should be in last
        System.out.println(Arrays.toString(v));
    }

}
