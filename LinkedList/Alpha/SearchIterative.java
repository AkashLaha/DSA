package com.akash.LinkedList.Alpha;

//Search for a Key in aLinked list. Return the position where it is found.
//if not found return -1
public class SearchIterative {
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

    public int Search(Node head,int key){
        Node temp=head;
        boolean flag=false;
        if(size==0){
            return -1;
        } else if (size==1) {
            if(key==temp.data)
                return size;
            else{
                return -1;
            }
        }
        else {
            size = 1;
            while (temp != null) {
                if (key == temp.data) {
                    flag = true;
                    break;
                } else {
                    temp = temp.next;
                    size++;
                }
            }
        }
        if(flag==true)
            return size;
        else {
            return -1;
        }
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
        SearchIterative si=new SearchIterative();
        si.addLast(1);
        si.addLast(2);
        si.addLast(3);
        si.addLast(4);
        si.addLast(5);
        System.out.println(si.Search(head,1));
    }
}
