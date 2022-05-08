package com.company;

public class Main {

    public static void main(String[] args) {
        //Circular queue avoids the wastage of space in a regular queue implementation using arrays.

//        NormalQueue queue = new NormalQueue(5);
//        queue.printQueue();
//        queue.enqueue(45);
//        queue.enqueue(21);
//        queue.enqueue(321);
//        System.out.println(queue.isFull());
//        queue.printQueue();
//        queue.enqueue(213);
//        queue.enqueue(-41);
//        System.out.println(queue.isFull());
//        queue.printQueue();
//        queue.enqueue(5555);
//        System.out.println("------");
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        System.out.println(queue.isEmpty());
//        queue.printQueue();
//        queue.dequeue();
//        queue.printQueue();
//        queue.dequeue();
//        System.out.println(queue.isEmpty());
//        queue.printQueue();
//        queue.enqueue(454);
//        queue.enqueue(454);
//        queue.enqueue(454);
//        queue.enqueue(454);
//        queue.enqueue(454);
//        queue.enqueue(454);
//        System.out.println("=============");

        //here we can see that in a normal queue after a bit of enqueueing and dequeuing, the size of actual queue gets reduced.
        //and the front indexes can only be used once the whole queue has been reset i.e. all elements have been dequeued in it.
//        NormalQueue queue1 = new NormalQueue(4);
//        queue1.enqueue(45);
//        queue1.enqueue(32);
////        queue1.enqueue(56); //uncomment this and you will see the error!
//        queue1.peek();
//        queue1.printQueue();
//        //now lets deque and enqueue again:-
//        queue1.dequeue();
//        queue1.printQueue();
//        queue1.enqueue(99);
//        queue1.enqueue(100);//here error will pop up!
//        queue1.printQueue();

        //To overcome this we make circular queue.
        //Circular Queue works by the process of circular increment i.e. when we try to increment the pointer and we reach the end of the queue,
        //we start from the beginning of the queue. Here, the circular increment is performed by modulo division with the queue size. That is,
        //if REAR + 1 == 5 (overflow!), REAR = (REAR + 1)%5 = 0 (start of queue). To understand this fully, firstly see the NormalQueue Class.

//        CircularQueue circularQueue = new CircularQueue(5);
//        circularQueue.printCircularQ();
//        circularQueue.enqueue(55);
//        circularQueue.enqueue(33);
//        circularQueue.enqueue(785);
//        circularQueue.printCircularQ();
//        circularQueue.dequeue();
//        circularQueue.dequeue();
//        circularQueue.peek();
//        circularQueue.printCircularQ();

        CQueue cQueue = new CQueue(5);
        cQueue.enqueue(45);
        cQueue.enqueue(423);
        cQueue.enqueue(4213);
        cQueue.printCircularQueue();
        cQueue.dequeue();
        cQueue.dequeue();
        cQueue.dequeue();
        cQueue.enqueue(32);
        cQueue.enqueue(-123);
        cQueue.enqueue(-1223);
        cQueue.enqueue(-1221323);
        cQueue.printCircularQueue();
    }
}