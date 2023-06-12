package com.akash.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12};
        int key=10;
        String menu[]={"dosa","idli","sandwich","chips","cold drinks","samosa"};
        String item="sandwich";
        int index=trav(num,key);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("key is in "+index+" index");
        }
        int value=scan(menu,item);
        if(value==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("key is in index "+value);
        }

    }
    public static int trav(int num[],int key){
        for(int i=0;i<=num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int scan(String menu[],String item){
        for(int i=0;i<=menu.length;i++){
            if(menu[i]==item){
                return i;
            }
        }
        return -1;
    }
}
