package com.akash.LinkedList.Alpha;

public class ReverseALinkedList {
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
    public static int size;

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;//because after loop curr=null then previous node of curr will be head
    }
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
    public void disp(Node head) {
        Node temp = head;
        if (head == null) {
            return;
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ReverseALinkedList rl=new ReverseALinkedList();
        rl.addLast(33);
        rl.addLast(4);
        rl.addLast(51);
        rl.addLast(9);
        rl.reverse();
        rl.disp(head);
    }
}
