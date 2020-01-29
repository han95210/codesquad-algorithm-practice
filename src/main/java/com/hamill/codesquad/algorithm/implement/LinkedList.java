package com.hamill.codesquad.algorithm.implement;

public class LinkedList {
    private ListNode head;

    public LinkedList() {
        this.head = null;
    }

    void insertLastNode(String str) {
        ListNode node = new ListNode(str);
        if(head == null) {
            head = node;
        }else{
            ListNode current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    void insertMiddleNode(ListNode pre, String str) {
        ListNode node = new ListNode(str);
        if(head == null) {
            head = node;
        }else{
            ListNode current = head;
            while(current.next != pre) {
                current = current.next;
            }
            current = current.next;
            node.next = current.next;
            current.next = node;
        }
    }

    void insertFirstNode(String str) {
        ListNode node = new ListNode(str);
        if(head == null) {
            head = node;
        }else{
            ListNode current = head;
            node.next = current;
            head = node;
        }
    }
}
