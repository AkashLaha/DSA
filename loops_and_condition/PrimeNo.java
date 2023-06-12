package com.akash.loops_and_condition;

public class PrimeNo {
    public static void main(String[] args) {
//        int n = 4;
//        int count=0;
//        for(int i=1;i<=n;i++){
//            if(n%i==0){
//                count++;
//            }
//        }
//        if(count==2){
//            System.out.println("Prime");
//        }
//        else{
//            System.out.println("Not Prime");
//        }
        int n=10;
        int count=0;

        for (int i=2;i<=n;i++){
            // i=2 every number is always divisible by 1
            // n/2: any no. can have max factor equal to or less than its half, other than the number itself
            // n-1 can also be used to check the no. is divisible by any no. other than 1 , n.
            if(i==2){
                System.out.println("prime");
                count++;
            }
            if(n%i==0){
                //System.out.println("not prime");
                break;

            }
            else{
                //System.out.println("prime");
                count++;
                break;
            }
        }
        System.out.println(count);
    }
}
