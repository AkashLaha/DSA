package com.akash.LinkedList;

public class lengthOfList {
    public static int length(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;

        }
        return count;
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

        int len=length(a);
        System.out.println(len);

    }
}
