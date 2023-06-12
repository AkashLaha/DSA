package com.akash.LinkedList;

public class DisplayUsingFunc {

    //using recursion
    public static void dispR(Node head){
        if(head==null)return;
        System.out.print(head.data+" ");
        dispR(head.next);
    }
    public static void disp(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
    }
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

        disp(a);//passes the 'a' value to head in the func
        //if we try to print disp(a) again it will work fine because the value of 'a' is preserved whereas if we try
        // to print the loop twice in the func the loop will not work because the head value will point to null int
        // the end of first loop and next loop condition will not satisfy
        System.out.println();
        dispR(a);
    }
}
