package com.akash.arrays;

public class practiceArray {
//    public static void main(String[] args) {
//        int arr[]={1,2,3,4,5,6};
//        rot(arr,2);
//        disp(arr);
//    }
//    public static void rev(int[] arr,int i,int j){
//        while(i<j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//        }
//    }
//    public static void rot(int arr[],int n){
//        rev(arr,0,n-2);
//        rev(arr,n-1,arr.length-1);
//        rev(arr,0,arr.length-1);
//
//    }
//    public static void disp(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//    }
    public static void main(String[] args) {
        int vCount=0;
        String str="hello how are you";
        str = str.replaceAll("\\s", ""); //this is used for removing whitespaces completely
        System.out.println(str);

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vCount++;
            }
        }
        double s=(vCount*100)/str.length()-1;
        System.out.format("%.4f",s);
    }

}
