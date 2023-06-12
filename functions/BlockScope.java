package com.akash.functions;

public class BlockScope {
    public static void main(String[] args) {
        int a=200;
        {
            a=10;//reassign the original value because the ref var is same one
            //int a=30; //already initialised outside the block, so it cannot be initialised again in the same function
            System.out.println(a);
            int c=20; //value initialised in the block will remain in the block
        }
        System.out.println(a);
    }
}
