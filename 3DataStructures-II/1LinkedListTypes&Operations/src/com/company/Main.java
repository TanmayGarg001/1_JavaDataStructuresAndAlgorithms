package com.company;

//V.V.Imp:-
//https://www.programiz.com/c-programming/c-structures
//https://www.programiz.com/c-programming/c-pointers
//https://www.programiz.com/c-programming/c-structures-pointers
public class Main {

    public static void main(String[] args) {
        //There are 3 common types of Linked List.
        //1.Singly Linked List:It is the most common. Each node has data and a pointer to the next node.
        //2.Doubly Linked List:We add a pointer to the previous node in a doubly-linked list. Thus, we can go in either direction: forward or backward.
        //3.Circular Linked List:A circular linked list is a variation of a linked list in which the last element is linked to the first element. This forms a circular loop.

        //This is the closest to what LinkedList is similar to the one which is in java, ofc it is not that optimized and it does not throw all types of exceptions and all, but
        //it is very close to the real one. Also this is SinglyLinkedList. LinkedList in java is implemented on the concept of DoublyLinkedList.
        //But the class does very similar operations.Like:- add,set,remove,remove(at particular index),size etc.

        JavaLinkedList linkedList2 = new JavaLinkedList();
        System.out.println(linkedList2.isEmpty());
        linkedList2.add(87);
        linkedList2.add(-9);
        linkedList2.add(67);
        System.out.println(linkedList2.isEmpty());
        linkedList2.add(0);
        linkedList2.add(213);
        System.out.println(linkedList2);
        System.out.println("====");
        System.out.println(linkedList2.get(2));
        System.out.println(linkedList2.size());
        linkedList2.add(2001);
        System.out.println(linkedList2);
        System.out.println(linkedList2.size());
        linkedList2.set(linkedList2.size() - 1, 3574);
        System.out.println(linkedList2);
        linkedList2.remove();
        System.out.println(linkedList2);
        linkedList2.remove(linkedList2.size() - 1);
        System.out.println(linkedList2);
        linkedList2.add(1, 9821);
        System.out.println(linkedList2);
    }
}
