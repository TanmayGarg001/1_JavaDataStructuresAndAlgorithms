package com.company;

import java.util.Vector;

public class GoodImplementationOfQueue<E> {

    Vector<E> queue;
    int capacity;

    public GoodImplementationOfQueue(int capacity) {
        this.capacity = capacity;
        queue = new Vector<>(capacity);
    }

    public GoodImplementationOfQueue() {
        queue = new Vector<>();
    }

    public boolean isFull() {
        return queue.size() == capacity;
    }

    public boolean isEmpty() {
        return queue.size() == 0;
    }

    public void enqueue(E item) {
        if (isFull()) {
            System.out.println("Can't enqueue, queue is already full!");
        } else {
            queue.add(item);
            System.out.println(item + " was enqueued to your queue.");
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Can't dequeue, queue is already empty!");
        } else {
            E element = queue.remove(0);
            System.out.println(element + " was dequeued from your queue.");
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty, nothing ot peek!");
        } else {
            System.out.println(queue.get(0) + " peeked.");
        }
    }

    public void printQueue() {
        System.out.println();
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.get(i) + " ");
        }
        System.out.println();
    }
}
