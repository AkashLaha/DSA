package com.akash;

import java.util.Date;
public class DateAndTime {
    public static void main(String[] args) {
        //miliosecond passed from 1970 use .currentTimeMillis()
        //divide by 1000 u get seconds
        //divide by 3600 u get in mins
        //divide by 24 u get in days
        //divide by 365 u get in years
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());


    }

}
