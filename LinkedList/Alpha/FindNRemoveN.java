package com.akash.LinkedList.Alpha;

//Find and Remove nth node from end
//we cannot traverse list from backward easily so if nth node is in n pos from backward
//then it will be size-n+1 from forward we will be traversing forward

public class FindNRemoveN {
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

    public static void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public static void disp(Node temp){
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void delete(int idx){
        int size=0;
        Node temp=head;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        if(idx==size){
           head=head.next;//head.next is null now head is null and is not pointing to anything
           return;
        }
        else{
            int i=1;
            Node prev=head;
            while(i<size-idx){//here what prev will traverse throu the loop till it is size-idx and then we did is if
                // we want to delete nth node(idx) we will run the loop till
                // size-idx because size-idx+1 will be the node we want to delete instead we will point prev's next
                // to size-idx's next
                prev=prev.next;
                i++;
            }
            prev.next=prev.next.next;
            return;
        }
    }

    public static void main(String[] args) {
        FindNRemoveN fr=new FindNRemoveN();
        addLast(4);
        addLast(7);
        addLast(1);
        addLast(5);
        fr.delete(3);
        disp(head);
    }
}
