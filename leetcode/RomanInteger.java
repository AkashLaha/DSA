package com.akash.leetcode;

public class RomanInteger {
    public static void main(String[] args) {
        String s="III";
        int sum=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='I'){
                sum=sum+1;
                i++;
                if(s.charAt(i)=='V'){
                    sum=sum+4;
                }
                if(s.charAt(i)=='X'){
                    sum=sum+9;
                }
            }
            if(s.charAt(i)=='V'){
                sum=sum+5;
            }
            if(s.charAt(i)=='X'){
                if(s.charAt(i+1)=='L'){
                    sum=sum+40;
                }
                else if(s.charAt(i+1)=='C'){
                    sum=sum+90;
                }
                else{
                    sum=sum+10;
                }
            }
            if(s.charAt(i)=='L'){
                sum=sum+50;
            }
            if(s.charAt(i)=='C'){
                if(s.charAt(i+1)=='D'){
                    sum=sum+400;
                }
                else if(s.charAt(i+1)=='M'){
                    sum=sum+90;
                }
                else{
                    sum=sum+100;
                }
            }
            if(s.charAt(i)=='D'){
                sum=sum+500;
            }
            if(s.charAt(i)=='M'){
                sum=sum+1000;
            }


        }
        System.out.println(sum);
    }
}
