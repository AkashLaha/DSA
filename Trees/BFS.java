package com.akash.Trees;

import java.util.*;
public class BFS {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
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
    public static int levelOrder(Node root) {
        if (root == null) return -1;
        Queue<Node> q = new LinkedList<>();
        int count = 1;
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode != null) {
//                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null)
                    q.add(currNode.right);
            }
            else {

                System.out.println();

                if (q.isEmpty()) {
                    break;
                }
                else {
                    q.add(null);
                    count++;
//                    if(count==level-1){
//                        while(!q.isEmpty()) {
//                            Node temp = q.remove();
//                            if (temp != null) {
//                                Node l = temp.left;
//                                Node r = temp.right;
//                                Node newNode = new Node(99);
//                                temp.left = newNode;
//                                newNode.left = l;
//                                Node newNode2=new Node(99);
//                                temp.right = newNode2;
//                                newNode2.right = r;
//                            }
//                        }
//
//                    }
                }
            }
        }
        return count;
    }






    public static void main(String[] args) {
//        Node newNode=new Node(1);
//        Node root=new Node(17);
//        root.left=new Node(12);
//        root.left.left=new Node(11);
//        root.left.right=new Node(15);
//        root.right=new Node(23);
//        root.right.right=new Node(25);
//        root.right.left=new Node(18);
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.left.right.left=new Node(6);
        root.left.right.right=new Node(7);
        root.left.right.right.left=new Node(8);
        root.right=new Node(3);

        System.out.println(levelOrder(root));
        System.out.println();
        disp(root);
    }
}
