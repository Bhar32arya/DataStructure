package org.example;

public class MiddleNodeLinkedList {

    static class LinkedNode {
        int data;
        LinkedNode next;

        public LinkedNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void findMiddleElement(LinkedNode rootNode) {
        LinkedNode slow = rootNode;
        LinkedNode fast = rootNode.next;

        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    public static void main(String[] args) {
        LinkedNode rootNode = new LinkedNode(10);
        rootNode.next = new LinkedNode(20);
        rootNode.next.next = new LinkedNode(30);
        rootNode.next.next.next = new LinkedNode(50);
        rootNode.next.next.next.next = new LinkedNode(70);
        findMiddleElement(rootNode);
    }
}
