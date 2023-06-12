package com.akash.LinkedList.Alpha;

public class SizeOfList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;//java will initialize its value as 0, by defining it as static u dont have to initialize
    // it again and again

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void disp(Node head){
        Node temp=head;
        if(head==null){
            return;
        }
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        SizeOfList sl=new SizeOfList();
        sl.addLast(1);
        sl.addLast(2);
        sl.addLast(3);
        sl.addLast(4);
        sl.disp(head);
        System.out.println();
        System.out.println(sl.size);
    }

}
