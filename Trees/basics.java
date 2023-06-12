package com.akash.Trees;

public class basics {
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
    public static void inOrder(Node root){
        if(root==null)return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");

    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void swap(Node root){

    }

    public static void main(String[] args) {
        Node root=new Node(17);
        root.left=new Node(12);
        root.right=new Node(23);
        root.left.left=new Node(11);
        root.left.right=new Node(15);
        root.right.right=new Node(25);
        root.right.left=new Node(18);
        preOrder(root);
//        inOrder(root);
//        System.out.println();
//        preOrder(root);
//        System.out.println();
//        postOrder(root);
    }
}
