package org.example;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class HeightOfBinaryTree {

    public static int height(Node root) {
        if(root != null) {
            return 1 + Math.max(height(root.left), height(root.right));
        }
        return 0;
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);
        System.out.println("Height of binary tree = " + height(root));
    }
}
