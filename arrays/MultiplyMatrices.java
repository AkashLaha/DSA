package com.akash.arrays;

public class MultiplyMatrices {
    public static void main(String[] args) {
        int a[][]={{3,5,9},{7,6,2},{4,3,5}};
        int b[][]={{1,0,0},{0,1,0},{0,0,1}};
        int c[][]=new int[3][3];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++){
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];

                }
                System.out.print(c[i][j]+" ");

            }
            System.out.println();
        }

    }
}
