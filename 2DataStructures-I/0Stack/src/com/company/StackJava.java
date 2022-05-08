package com.company;

import java.util.Vector;

public class StackJava<E> {//generics fucking dope

    //I will use vector here as Java's stack's class extend Vector class.
    private final Vector<E> stack;//i used E here so that we can make stack of doubles,integers,strings etc. and made class generic.
    private int capacity;

    public StackJava(int capacity) {
        this.capacity = capacity;
        stack = new Vector<>();
    }

    public StackJava() {
        stack = new Vector<>();
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void push(E element) throws Exception {
        if (isFull()) {
            throw new Exception("Stack Overflow!, Limit " + capacity + " reached!");
        } else {
            stack.add(element);
        }
    }

    public void pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty, can't pop!");
        } else {
            stack.remove(stack.size() - 1);
        }
    }

    public E peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Can't peek, stack is empty!");
        } else {
            return stack.get(stack.size() - 1);
        }
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public boolean isFull() {
        return stack.size() == capacity;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        System.out.println();
        String output = "[";
        for (int i = stack.size() - 1; i >= 0; i--) {
            if (i == 0) {
                output = output + stack.get(i) + "]";
            } else {
                output = output + stack.get(i) + ",\n";
            }
        }
        return output;
    }

}