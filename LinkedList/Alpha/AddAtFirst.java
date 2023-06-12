package com.akash.LinkedList.Alpha;

public class AddAtFirst {
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

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        else {
            newNode.next=head;
            head=newNode;
        }
    }

    public static void main(String[] args) {
        AddAtFirst ll=new AddAtFirst();//as we have created object then it doesnt matter if the method is static or
        // nonstatic both of them can be called easily by object
         ll.addFirst(1);
         ll.addFirst(2);
    }
}
