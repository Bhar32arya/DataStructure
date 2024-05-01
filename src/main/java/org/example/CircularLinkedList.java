package org.example;

public class CircularLinkedList {

    static class CNode {
        CNode next;
        int data;

        public CNode(int data) {
            this.data = data;
        }
    }

    static class CircularLinkedListImpl {
        CNode head;

        public void add(int data) {
            CNode cNode = new CNode(data);
            if(head == null) {
                head = cNode;
                cNode.next = head;
            } else {
                CNode tmp = head;
                while (tmp.next != head) {
                    tmp = tmp.next;
                }
                tmp.next = cNode;
                cNode.next = head;
            }
        }

        public void printNode() {
            CNode tmp = head;
            while (tmp.next != head) {
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
        }
    }
}
