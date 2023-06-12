package com.akash;

import java.util.Calendar;
public class Calendarclass {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
//        System.out.println(c.getCalendarType()); //type will be gregorian because normal calenders are called gregory
//        System.out.println(c.getTimeZone());
//        System.out.println(c.getTimeZone().getID());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE));
    }
}
