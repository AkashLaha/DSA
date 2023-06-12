package com.akash.LinkedList.Alpha;

public class SearchRecursion {
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

    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 1;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

//    public int Search(int key){
//        return helper(head,key);
//    }
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
        SearchRecursion sr=new SearchRecursion();
        sr.addLast(12);
        sr.addLast(22);
        sr.addLast(53);
        sr.addLast(14);
        sr.addLast(45);
//        System.out.println(sr.Search(14));
        System.out.println(sr.helper(head,14));
    }
}
