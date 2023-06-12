package com.akash.LinkedList.Alpha;

public class RemoveFirstNLast {
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

    public int removeFirst(){
        if(size==0){
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;//returning a random value not a valid value
        }
        else if (size==1){
            int val=head.data;
            head=tail=null;
            size=0;//as there was only one node that to be have been removed then linkedlist doesnt exist
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;//amount of time this func will be called size will be decremented
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("empty list");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node temp=head;
        for(int i=1;i<size-1;i++){//after the loop complete temp will be on size-1 node
            temp=temp.next;
        }
        int val=tail.data;
        temp.next=null;
        tail=temp;
        size--;
        return val;
    }

    public static void main(String[] args) {
        RemoveFirstNLast r=new RemoveFirstNLast();
        r.addLast(1);
        r.addLast(2);
        r.addLast(3);
        r.addLast(4);
        r.disp(head);
//        r.removeFirst();
        r.removeLast();
        System.out.println();
        r.disp(head);
    }
}
