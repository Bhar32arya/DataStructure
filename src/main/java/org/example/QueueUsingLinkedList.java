package org.example;
public class QueueUsingLinkedList {

    static class QNode {
        QNode next;
        int data;

        public QNode(int data) {
            this.next = null;
            this.data = data;
        }
    }

    static class QueueImpl {
        QNode front;
        QNode rear;

        public void enQueue(int data) {
            QNode qNode = new QNode(data);

            if(rear == null) {
                rear = qNode;
                front = qNode;
            } else {
                rear.next = qNode;
                rear = qNode;
            }

        }

        public int dQueue() throws Exception {
            if(front == null && rear == null) {
                throw new Exception("no element present in queue");
            } else {
                int data = front.data;
                front = front.next;
                return data;
            }
        }
    }
}
