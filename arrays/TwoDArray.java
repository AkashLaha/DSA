package com.akash.arrays;

public class TwoDArray {
    public static void main(String[] args) {
//        int A[][] = new int[5][5];
        //int B[][] = {{1, 2, 3}, {2, 4, 6}, {1, 3, 5}};
//        int C[][];
//        C = new int[3][4];
//        int[] F,D[];
        //here F is a 1D array whereas D is a 2D array
        //when we seperate them, they look like:
        //int[] F;
        //int[] D[];

//        for (int i=0;i<B.length;i++){
//            for(int j=0;j<B[0].length;j++){
//                System.out.print(B[i][j]+" ");
//            }
//            System.out.println();
//        }
        //its a Jagged Array
        int A[][];
        A=new int[3][];
        A[0]=new int[3];
        A[1]=new int[5];
        A[2]=new int[2];

        for (int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
               System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
