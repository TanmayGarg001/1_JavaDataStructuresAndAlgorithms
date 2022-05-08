package com.company;

public class CQueue {
    private int front;
    private int rear;
    private int capacity;
    private int[] circularQueue;

    public CQueue(int capacity) {
        this.capacity = capacity;
        circularQueue = new int[capacity];
        front = -1;
        rear = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full, can't enqueue!");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % capacity;
            circularQueue[rear] = value;
            System.out.println(value + " was enqueued.");
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, can't dequeue!");
        } else {
            int value = circularQueue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % capacity;
                System.out.println(value + " was dequeued.");
            }
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Can't peek, circular queue is empty!");
        } else {
            System.out.println(circularQueue[front] + " peeked.");
        }
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == capacity - 1) || (front == rear + 1);
    }

    public void printCircularQueue() {
        System.out.println();
        if (isEmpty()) {
            System.out.println("Can't print queue is empty!");
        } else {
            for (int i = front; i != rear; i = (i + 1) % capacity) {
                System.out.print(circularQueue[i] + " ");
            }
            System.out.print(circularQueue[rear]);
        }
        System.out.println();
    }

}

