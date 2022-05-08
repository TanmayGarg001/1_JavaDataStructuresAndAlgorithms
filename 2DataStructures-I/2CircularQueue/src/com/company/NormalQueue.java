package com.company;

public class NormalQueue {

    private int front;
    private int rear;
    private int capacity;
    private int[] queue;

    public NormalQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Can't enqueue, queue is already full!");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = value;
            System.out.println(value + " was enqueued.");
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Can't dequeue, queue is already empty!");
        } else {
            int value = queue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
                System.out.println(value + " was dequeued.");
            }
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Empty queue!, can't peek.");
        } else {
            System.out.println(queue[front] + " peeked.");
        }
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return front == 0 && rear == capacity - 1;
    }

    public void printQueue() {
        System.out.println();
        if (front == -1) {
            System.out.println("Queue is empty can't print!");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

}
