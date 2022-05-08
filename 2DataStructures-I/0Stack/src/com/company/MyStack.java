package com.company;

//let's try to implement stack as mentioned in the instructions
//in this approach the problem is that we are using static arrays, so we can't really pop the original array. We have to make a new array  of length of originalLength-1
//and then copy the other elements of the previous array.
//which is fine but it would take a lot of time.Instead we could use ArrayList or vector depending upon the fact if we require thread safety or not.
//Maneuver to StackImplementationLikeJava class.
public class MyStack {
    private int top;
    private int[] stack;
    private int size;

    public MyStack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;//here I initialized top equal to -1, so that we can take care of 0 indexing in array and reduce the chance of errors.
    }

    public void printStack() {
        System.out.println("------------");
        for (int i = stack.length - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow!\nLimitReached\n");
        } else {
            stack[++top] = value;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Empty!");
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, can't peek!");
        }
        return stack[top];
    }

    //returns true if top==-1, that means stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    //returns true if top==size - 1, that means stack is full
    public boolean isFull() {
        return top == size - 1;
    }


}
