package com.akash.leetcode;

import com.akash.Trees.HeightOfTree;

public class MergeTwoNodes {
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
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
    public void disp(){
        Node temp=head;
        if(head==null){
            return;
        }
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeTwoNodes m1=new MergeTwoNodes();
        m1.addLast(1);
        m1.addLast(2);
        m1.addLast(3);
        MergeTwoNodes m2=new MergeTwoNodes();
        m2.addLast(2);
        m2.addLast(5);
        m2.addLast(6);
        m1.disp();
        System.out.println();
        m2.disp();
    }

}
