package com.akash.arrays;

public class AddMatrices {
    public static void main(String[] args) {
        int a[][]={{3,5,9},{7,6,2},{4,3,5}};
        int b[][]={{1,5,2},{6,8,4},{3,9,7}};
        int c[][]=new int[3][3];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
