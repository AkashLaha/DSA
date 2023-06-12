package com.akash.arrays;

public class twoDArrays {
    public static void main(String[] args) {
        int [][] arr=new int[3][3];
        //first [] is for row and other is for column
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=5;
        arr[1][0]=3;
        arr[1][1]=7;
        arr[1][2]=9;
        arr[2][0]=1;
        arr[2][1]=6;
        arr[2][2]=0;
        for(int i=0;i<arr.length;i++){
            System.out.println();
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }

    }
}
