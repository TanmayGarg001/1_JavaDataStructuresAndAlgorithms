package com.company;
//here we term enqueue/dequeue as Remove or Insert for easier understandable purposes.
public class Deque {
    private static final int max = 100;
    private int front;
    private int rear;
    private int capacity;
    private int[] deque;

    public Deque(int capacity) {
        this.capacity = capacity;
        deque = new int[max];
        front = -1;
        rear = 0;
    }

    public void insertFront(int value) {
        if (isFull()) {
            System.out.println("Can't insert, deque is full!");
        } else {
            if (front == -1) {
                front = 0;
                rear = 0;
            } else if (front == 0) {
                front = capacity - 1;
            } else {
                front = front - 1;
            }
            deque[front] = value;
            System.out.println(value + " was inserted.");
        }
    }

    public void insertRear(int value) {
        if (isFull()) {
            System.out.println("Can't insert, deque is full!");
        } else {
            if (front == -1) {
                front = 0;
                rear = 0;
            } else if (rear == capacity - 1) {
                rear = 0;
            } else {
                rear = rear + 1;
            }
            deque[rear] = value;
            System.out.println(value + " was inserted.");
        }
    }

    public void deleteFront() {
        if (isEmpty()) {
            System.out.println("Can't delete, deque is empty!");
        } else {
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (front == capacity - 1) {
                front = 0;
            } else {
                front = front + 1;
            }
            System.out.println(deque[rear] + " was deleted!");
        }
    }

    public void deleteRear() {
        if (isEmpty()) {
            System.out.println("Can't delete, deque is empty!");
        } else {
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (rear == 0) {
                rear = capacity - 1;
            } else {
                rear = rear - 1;
            }
            System.out.println(deque[rear] + " was deleted!");
        }
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Can't get front, deque is empty!");
        } else {
            System.out.println(deque[front] + " printed.");
        }
        return deque[front];
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("Can't get rear, deque is empty!");
        } else {
            System.out.println(deque[rear] + " printed.");
        }
        return deque[rear];
    }


    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == capacity - 1) || (front == rear + 1);
    }

}
