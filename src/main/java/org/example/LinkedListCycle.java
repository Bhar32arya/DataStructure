package org.example;

import java.util.HashSet;

class CycleLinkedList {
    ListNode head;

    static class ListNode {
        int data;
        ListNode next;
        public ListNode(int data) {
            this.data = data;
        }
    }

    public boolean findCycle() {
        ListNode tmp = head;
        HashSet<ListNode> listNodes = new HashSet<>();
        while (tmp != null) {
            if(listNodes.contains(tmp)) {
                return true;
            }
            listNodes.add(tmp);
            tmp = tmp.next;
        }
        return false;
    }
}