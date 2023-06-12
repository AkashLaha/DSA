package com.akash.Inheritance;
import java.util.*;
interface Arithmetic{
    int sum(int n);
}
class My4 implements Arithmetic{
    int sum=0;
    public int sum(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}
public class InterfaceProblem {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        My4 m=new My4();
        System.out.println(m.sum(1));
    }
}
