package com.company;

public class MyLinkedList {

    Node head;

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.head = new Node(5);

        Node one = new Node(11);
        Node two = new Node(12);
        Node three = new Node(13);

        linkedList.head.next = one;
        one.next = two;
        two.next = three;

        while (linkedList.head != null) {
            System.out.println(linkedList.head.data + " ");
            linkedList.head = linkedList.head.next;
        }
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }

    }

}
