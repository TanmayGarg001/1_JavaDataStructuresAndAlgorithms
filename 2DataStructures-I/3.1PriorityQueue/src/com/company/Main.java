package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        //A priority queue is a special type of queue in which each element is associated with a priority and is served according to its priority.
        //If elements with the same priority occur, they are served according to their order in the queue.
        //The element with the highest value is considered as the highest priority element. However, in other cases,
        //we can assume the element with the lowest value as the highest priority element. In other cases, we can set priorities according to our needs.

        //In a queue, the first-in-first-out rule is implemented whereas, in a priority queue, the values are removed on the basis of priority.
        //The element with the highest priority is removed first.
        //Before studying the priority queue, please refer to the heap data structure for a better understanding of binary heap as it is used to implement the priority queue
        //https://www.programiz.com/dsa/heap-data-structure
        //Heapify is the process of creating a heap data structure from a binary tree. It is used to create a Min-Heap or a Max-Heap.

        PriorityQueue<Integer> integers = new PriorityQueue<>(Comparator.reverseOrder());
        integers.add(45);
        integers.add(213);
        integers.add(-44);
        integers.add(-56);
        integers.add(215);
        integers.add(991);
        integers.add(0);

        System.out.println(integers);
        System.out.println(integers.remove());
        System.out.println(integers.remove());
        System.out.println(integers);

        System.out.println(integers.peek());


    }

    public static void approach2(int k, int[] array) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            l.add(array[i]);
        }
        pq.addAll(l);
    }
}
