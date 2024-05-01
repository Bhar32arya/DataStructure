package org.example;

public class ReverseLinkedList {

    public static void main(String[] args) {
        Node head = new Node(5);
        head.right = new Node(10);
        head.right.right = new Node(15);

        printList(head);
        Node reverseHead = reverseLinkedList(head);
        System.out.println("**********");
        printList(reverseHead);
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.println(head.data + "= " + head.right);
            head = head.right;
        }
    }

    public static Node reverseLinkedList(Node head) {
        if(head == null || head.right == null) {
            return null;
        }
        else {
            Node prev = head;
            Node current = head.right;

            while (current != null) {
                Node nextNode = current.right;

                current.right = prev;

                prev = current;
                current = nextNode;
            }
            head.right = null;
            head = prev;
            return head;
        }
    }
}
