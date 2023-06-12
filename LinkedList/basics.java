package com.akash.LinkedList;

public class basics {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(10);
        Node c=new Node(3);
        Node d=new Node(15);
        Node e=new Node(22);
        a.next=b;
        b.next=c;//x.next.data;10
        c.next=d;//x.next.next.data;3
        d.next=e;

        //Displaying the Linked List
        Node temp=a;//contains the address and value of a
        //System.out.println(temp.data);
//        for(int i=1;i<=5;i++){
//            System.out.print(temp.data+" ");//for the first iteration it will print the data of 'a' then it gets
//            // initializes to temp.next then next value in the sout will be temp.next.data which is a.next.data(i.e, b)
//            //and then it goes on like this
//            temp=temp.next;
//
//        }

        //if the list size is not given then
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        //why we are assigning value of 'a' to temp we can simply use 'a'?
        //Because if u try to print the loop again the loop will not work because then 'a' value will be null
        //as the iteration goes for the first time a's pointer shifts(i.e a will point to b or c) and at the end its
        // value will be null at the last iteration thats why we use temp to preserve the value of a
    }
}
