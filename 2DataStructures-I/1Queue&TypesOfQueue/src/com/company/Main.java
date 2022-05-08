package com.company;

public class Main {

    public static void main(String[] args) {

        //A queue is a useful data structure in programming. It is similar to the ticket queue outside a cinema hall,
        //where the first person entering the queue is the first person who gets the ticket.
        //Queue follows the First In First Out (FIFO) rule - the item that goes in first is the item that comes out first.
        //In programming terms, putting items in the queue is called enqueue, and removing items from the queue is called dequeue.

        //A queue is an object (an abstract data structure - ADT) that allows the following operations:
        //Enqueue: Add an element to the end of the queue
        //Dequeue: Remove an element from the front of the queue
        //IsEmpty: Check if the queue is empty
        //IsFull: Check if the queue is full
        //Peek: Get the value of the front of the queue without removing it

        //Maneuver to MyQueue class to check the implementation.
        //Lame implementation of queue :-
//        MyQueue queue = new MyQueue(4);
//        queue.enqueue(44);
//        queue.enqueue(421);
//        queue.printQueue();
//        queue.enqueue(213);
//        queue.enqueue(748);
//        queue.printQueue();
//        queue.enqueue(69);
//        queue.printQueue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.printQueue();
//        queue.dequeue();
//        queue.printQueue();
//        queue.dequeue();

        //Useful implementation of queue :-
        GoodImplementationOfQueue<Integer> queue = new GoodImplementationOfQueue<>(5);
        queue.enqueue(45);
        queue.enqueue(12);
        queue.peek();
        queue.enqueue(321);
        System.out.println(queue.isFull());
        queue.printQueue();
        queue.enqueue(241);
        queue.enqueue(-154);
        queue.printQueue();
        queue.enqueue(999);
        System.out.println(queue.isFull());
        queue.peek();
        queue.printQueue();
        System.out.println("=========");
        queue.dequeue();
        queue.dequeue();
        queue.printQueue();
        queue.peek();
        queue.dequeue();
        queue.printQueue();
        System.out.println(queue.isEmpty());
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.isEmpty());
        queue.dequeue();

    }

}
