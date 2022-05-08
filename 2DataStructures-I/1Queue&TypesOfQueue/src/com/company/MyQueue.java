package com.company;

//here also the same problem arises we can overcome that by just printing the required values, but stoll the memory will hold the values.

public class MyQueue {
    private int front;
    private int rear;
    private int[] queue;
    private int size;

    public MyQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1; // initially both rear and front are -1 because queue is empty
        rear = -1;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue already full!");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = value;
            System.out.println(queue[rear] + " enqueued.");
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is already empty!");
        } else {
            if (front > rear) {
                System.out.println("Queue is already empty!");
            } else {
                System.out.println(queue[front] + " dequeued.");
                return queue[front++];
            }
        }
        return 0;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == size - 1);
    }

    public void printQueue() {
        System.out.println();
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

}
