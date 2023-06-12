package com.akash.loops_and_condition;

public class nextOddEven {
    public static void main(String[] args) {
        int n=1234;
        int odd,even;
        while(n!=0){
            int a=n%10;
            if(a%2==0){
                even=a+2;
                System.out.println(even);
            }
            else{
                odd=a+2;
                System.out.println(odd);
            }
            n=n/10;
        }
    }
}
