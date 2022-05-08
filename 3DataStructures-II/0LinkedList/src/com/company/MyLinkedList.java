package com.company;

public class MyLinkedList {

    Node head;

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();

        //assign values to the nodes
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        //connecting the nodes
        linkedList.head.next = second;
        second.next = third;

        //printing the list
        while (linkedList.head != null) {
            System.out.print(linkedList.head.data + " ");
            linkedList.head = linkedList.head.next;
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

}
