package com.akash.LinkedList.Alpha;

public class AddInBetn {
    public static class Node{
        Node next;
        int data;
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
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void addInBetn(int idx,int data){
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void disp(Node head){
        if(head==null){
            return;
        }
        while(head!=null){
            System.out.print(head.data+"-->");
            head=head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        AddInBetn ad=new AddInBetn();
        ad.addLast(5);
        ad.addLast(7);
        ad.addLast(2);
        ad.addLast(44);
        ad.addInBetn(1,38);
        ad.disp(head);
    }
}
