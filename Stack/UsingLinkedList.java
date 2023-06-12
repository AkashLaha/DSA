package com.akash.Stack;

public class UsingLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head=newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
            return;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;//as we are not poping elem from memory but the garbage collector automatically clears
            // the node because its not being in used or no other elem is pointing towards it
            return top;
        }

        public static int peek() {
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(4);
        stack.push(3);
        stack.push(6);
        stack.push(9);

        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
        System.out.println("null");
    }
}
