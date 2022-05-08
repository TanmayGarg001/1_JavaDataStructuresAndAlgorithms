package com.company;

public class LList {

    Node head;

    public static void main(String[] args) {
        LList linkedList = new LList();
        linkedList.head = new Node(11);
        Node second = new Node(22);
        Node third = new Node(33);

        linkedList.head.next = second;
        second.next = third;

        while (linkedList.head != null) {
            System.out.println(linkedList.head.data + " ");
            linkedList.head = linkedList.head.next;
        }
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

}
