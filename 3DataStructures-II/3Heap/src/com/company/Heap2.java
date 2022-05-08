package com.company;

import java.util.Collections;
import java.util.PriorityQueue;

class Heap2 {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.add(12);
        priorityQueue.add(10);
        priorityQueue.add(-45);
        priorityQueue.add(0);
        priorityQueue.add(100);
        priorityQueue.add(-49);
        priorityQueue.add(541);
        System.out.println(priorityQueue.peek());

        System.out.println(priorityQueue);
        priorityQueue.remove();//Retrieves and removes the head of this queue. This method differs from poll only in that it throws an exception if this queue is empty.
        //This implementation returns the result of poll unless the queue is empty.
        System.out.println(priorityQueue);

    }

}