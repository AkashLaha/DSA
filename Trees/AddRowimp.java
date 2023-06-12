package com.akash.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class AddRowimp {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void disp(Node root){
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode != null) {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null)
                    q.add(currNode.right);
            }
            else{
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }

        }
        return;
    }
    public static Node delete(int data, Node root){
        if(root==null){
            return null;
        }
       else if(root.data>data){
           delete(data,root.left);
       }
       else if(root.data<data){
           delete(data,root.right);
       } else if (root.data==data) {
           if(root.left==null && root.right==null){
               return null;
           }
           else if(root.right==null){
              return root.left;
           }
           else if(root.left==null){
              return root.right;
           }
           else{
               //find the successor
               Node temp=root.right;
               while(temp.left!=null){
                   temp=temp.left;
               }
               int t=temp.data;
               root.right= delete(t,root.right);
               root.data=t;
           }

       }
       return root;
    }
   

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.left.right=new Node(6);
        root.right=new Node(3);
        root.right.left=new Node(5);
        root.right.left.right=new Node(7);
        disp(root);
        System.out.println();
        delete(2,root);
        disp(root);
        
       
    }
}
