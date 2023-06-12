package com.akash.LinkedList;

public class ReverseList {
    public static void disprev(Node head){
        if(head==null)return;
        disprev(head.next);
        System.out.println(head.data);
    }
    public static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(10);
        Node d=new Node(2);
        a.next=b;
        b.next=c;
        c.next=d;
        disprev(a);
    }
}
