package com.akash.LinkedList;

public class InsertInBetn {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int data){
            Node temp=new Node(data);
            if(head==null){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
        }
        void insertAtst(int data){
            Node temp=new Node(data);
            if(head==null){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        void insertInBetn(int idx,int data){
            Node temp=new Node(data);
            Node t=head;
            if(idx==0){
                temp.next=head;
                head=temp;
            }
            for(int i=1;i<=idx-1;i++){
                t=t.next;
            }
            if(t!=null){
                temp.next=t.next;
                t.next=temp;
            }

        }
        int getAt(int idx){
            Node temp=head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;

            }
        }
    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtst(4);
        ll.insertAtst(7);
        ll.insertAtst(12);
        ll.insertAtst(5);
        ll.display();
        System.out.println();
        ll.insertInBetn(2,66);
        ll.display();
    }
}
