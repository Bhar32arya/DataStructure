package org.example;

public class StackUsingLinkedList {

    static class StackNode {
        StackNode next;
        int data;

        public StackNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class StackImpl {
        StackNode top;

        public void push(int data) {
            StackNode stackNode = new StackNode(data);
            if (top == null) {
                top = stackNode;
            } else {
                stackNode.next = top;
                top = stackNode;
            }
        }

        public void pop() {
            if(top != null) {
                int data  = top.data;
                top = top.next;
            }
        }
    }
}
