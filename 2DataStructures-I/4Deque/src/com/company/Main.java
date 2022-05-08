package com.company;

import java.util.ArrayDeque;

//Dequeue is doubly ended queue
public class Main {

    public static void main(String[] args) {
        //Deque or Double Ended Queue is a type of queue in which insertion and removal of elements can be performed from either
        //from the front or rear. Thus, it does not follow FIFO rule (First In First Out).

        //Types of Deque:-
        //Input Restricted Deque: In this deque, input is restricted at a single end but allows deletion at both the ends.
        //Output Restricted Deque: In this deque, output is restricted at a single end but allows insertion at both the ends.
        //We can implement this using either LinkedList or arrays.
        //in built class "ArrayDeque" is used fot these operations.

        Deque dq = new Deque(4);

        System.out.println("Insert element at rear end : 12 ");
        dq.insertRear(12);

        System.out.println("insert element at rear end : 14 ");
        dq.insertRear(14);

        System.out.println("get rear element : " + dq.getRear());

        dq.deleteRear();
        System.out.println("After delete rear element new rear become : " + dq.getRear());

        System.out.println("inserting element at front end");
        dq.insertFront(13);

        System.out.println("get front element: " + dq.getFront());

        dq.deleteFront();

        System.out.println("After delete front element new front become : " + +dq.getFront());

        System.out.println("=================================");

        //This is very useful as we can make FIFO and LIFO data-structure from them.

        ArrayDeque<Integer> integers = new ArrayDeque<>();
        integers.addFirst(45);
        integers.addFirst(25);
        integers.addFirst(998);
        integers.addFirst(3125);
        integers.addLast(235);
        System.out.println(integers);
        integers.removeFirst();
        integers.removeLast();
        System.out.println(integers);
        integers.addLast(458);
        integers.addLast(998);
        integers.addFirst(-32);
        integers.addLast(658);
        System.out.println(integers);
        integers.add(998);
        System.out.println(integers);
        integers.removeFirstOccurrence(998);
        System.out.println(integers);
        integers.removeLastOccurrence(998);
        System.out.println(integers);

    }
}