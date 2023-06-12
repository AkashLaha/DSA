package com.akash.LinkedList;

//Insert at the end
public class LInkedList2 {
    public static class Node{
        int data;
        Node next;

       public Node(int data){
            this.data=data;
            this.next=null;
       }
    }
//    public static Node head;
//    public static Node tail;
//
//    public void addLast(int data){
//        Node newNode=new Node(data);
//        tail.next=newNode;
//        tail=newNode;
//    }
//
//    public static void main(String[] args) {
//        LInkedList2 l2=new LInkedList2();
//        l2.addLast(1);
//        l2.addLast(2);
//    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }

        //no need to use param in disp() because it is in continuous order to insertAtend so it will get values from
        // that func
        void disp(){//no need to type public static for every func because class is already public static
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
        int size(){
            int count=0;
            Node temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.disp();
        System.out.println(ll.size());
    }
}
