package com.akash.LinkedList;

//insert a node at the head
public class LinkedList1 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
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
        void disp(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
//    public static Node head;
//    public static Node tail;
//
//    public void addFirst(int data){
//        Node newNode=new Node(data);
//        if(head==null){
//            head=tail=newNode;
//            return;
//        }
//        newNode.next=head;
//        head=newNode;
//    }

    public static void main(String[] args) {
//        LinkedList1 ll=new LinkedList1();
//        ll.addFirst(1);
//        ll.addFirst(2);
        linkedlist ll=new linkedlist();
        ll.insertAtst(3);
        ll.insertAtst(4);
        ll.insertAtst(5);
        ll.disp();

    }
}
