package com.akash;

import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Random rn=new Random();
        int x=rn.nextInt();
        //it will generate a random int that lies betn -2bil to +2bil
        int y=rn.nextInt(6);
        //it will generate num betn 0 to 5
        int z=rn.nextInt(6)+1;
        //it add 1 to every num generated
        double a=rn.nextDouble();
        //num betn 0 to 1
        boolean b=rn.nextBoolean();
        System.out.println(x);
    }
}
