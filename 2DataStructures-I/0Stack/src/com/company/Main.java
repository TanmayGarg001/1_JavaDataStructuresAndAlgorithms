package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

        //A stack is a useful data structure in programming. It is just like a pile of plates kept on top of each other.
        //elements on stack are added on top and removed from top just like a pile of plate

        //Think about the things you can do with such a pile of plates
        //-Put a new plate on top
        //-Remove the top plate
        //If you want the plate at the bottom, you must first remove all the plates on top.
        // Such an arrangement is called Last In First Out(LIFO) - the last item that is the first item to go out.
        //So the latest item that was in there will be the 1st one to get removed too.

        //In programming terms, putting an item on top of the stack is called push and removing an item is called pop.
        //The abstract datatype is special kind of datatype, whose behavior is defined by a set of values and set of operations. The keyword “Abstract” is used as
        // we can use these data-types, we can perform different operations. But how those operations are working that is totally hidden from the user. The ADT is made
        // of with primitive data-types, but operation logics are hidden.

        //Some examples of ADT are Stack, Queue, List etc.
        //A stack is an object (an abstract data type - ADT) that allows the following operations:
        //Push: Add an element to the top of a stack
        //Pop: Remove an element from the top of a stack
        //IsEmpty: Check if the stack is empty
        //IsFull: Check if the stack is full
        //Peek: Get the value of the top element without removing it

        //Maneuver to MyStack class to check the implementation.

        //Lame implementation of stack :-
//
//        MyStack stack = new MyStack(5);
//        stack.printStack();
//        stack.push(3);
//        stack.push(213);
//        stack.push(56);
//        stack.printStack();
//        stack.push(56);
//        stack.push(21356);
//        stack.printStack();
//        System.out.println(stack.pop());
////        stack.push(55);
////        stack.push(55);
////        stack.push(55);

        // StackImplementationLikeJava class's implementation :-
        StackJava<Integer> integerStack = new StackJava<>(4);
        integerStack.push(54);
        integerStack.push(521321);
        integerStack.push(521);
        System.out.println(integerStack);
        System.out.println(integerStack.peek());
        integerStack.push(44);
        integerStack.push(441);
        System.out.println(integerStack);
        integerStack.pop();
        integerStack.pop();
        System.out.println(integerStack.peek());

    }

}
