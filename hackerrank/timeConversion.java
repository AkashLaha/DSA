package com.akash.hackerrank;

public class timeConversion {
    public static void main(String[] args) {
        String str="06:40:03AM";
        int s=0;
        if(str.endsWith("PM")){
            if(str.startsWith("12")) {
                s = Integer.parseInt(str.substring(0, 2));
                s = s + 0;
            }
            else{
                s = Integer.parseInt(str.substring(0, 2));
                s = s + 12;
            }
        }
        else if(str.endsWith("AM") ){
            if(str.startsWith("12")){
                s=Integer.parseInt(str.substring(0,2));
                s=s-12;
            }
            else{
                s=Integer.parseInt(str.substring(0,2));
                s=s-0;
            }
        }
        System.out.format("%02d%s",s,str.substring(2,8));
        /*return String.format("%02d%s", hours, s.substring(2, 8));
        This line formats the hours and remaining substring of the input string in the format "hh:mm:ss".
        %02d is a formatting specifier that ensures the hours value is displayed with leading zeros if necessary.
        s.substring(2, 8) extracts the substring containing the minutes and seconds from the input string.*/
    }
}
