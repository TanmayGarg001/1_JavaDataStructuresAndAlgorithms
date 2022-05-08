package com.company;

public class CircularQueue {

    private int front;
    private int rear;
    private int capacity;
    private int[] circularQ;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        circularQ = new int[capacity];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (front == rear + 1) || (front == 0 && rear == capacity - 1);
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Can't enqueue, queue is already full.");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % capacity;
            circularQ[rear] = value;
            System.out.println(value + " was enqueued.");
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Can't dequeue, queue is already empty.");
        } else {
            int value = circularQ[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % capacity;
            }
            System.out.println(value + " was dequeued.");
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Can't peek queue is  empty!");
        } else {
            System.out.println(circularQ[front] + " peeked.");
        }
    }

    public void printCircularQ() {
        System.out.println();
        if (isEmpty()) {
            System.out.println("Can't print, empty queue!");
        } else {
            for (int i = front; i != rear; i = (i + 1) % capacity) {
                System.out.print(circularQ[i] + " ");
            }
        }
        System.out.println();
    }

}