package com.akash.LinkedList.Alpha;

public class AddAtLast {
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

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        else {
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public Node change(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node prev=null;
        Node curr=head;
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        curr.next=head.next;
        prev.next=head;
        head.next=null;
        head=curr;
        return curr;

    }


    public static void main(String[] args) {
        AddAtLast ll=new AddAtLast();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.display(head);
        System.out.println();
       ll.change(head);
        ll.display(head);
    }

}
