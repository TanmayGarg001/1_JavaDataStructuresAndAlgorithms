package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //a method is a recursive when iut calls itself.
        //Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simple problems
        // which are easier to solve. Recursion may be a bit difficult to understand. The best way to figure out how it works is to experiment with it.

        //To understand recursion let's code to find a factorial of number.
        //0!=1 , 3!=3*2*1=6
        //First let's do this by using for loop.
        factorialUsingForLoop(scanner.nextByte());
        System.out.println(factorialUsingRecursion(scanner.nextByte()));

    }

    public static void factorialUsingForLoop(int n) {
        if (n == 0) {
            System.out.println("Factorial of " + n + " is = 1");
        } else {
            int output = 1;
            for (int i = n; i >= 1; i--) {
                output = output * i;
            }
            System.out.println("Factorial of " + n + " is = " + output);
        }
    }

    //Now using recursion, see the image, think of it as this :-
    //in factorial we can see that,
    //1! = 1*0! = 1
    //2! = 2*1! = 2
    //3! = 3*2! = 6
    //so in general, n! = n*(n-1)!

    public static int factorialUsingRecursion(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        if (n < 0) {
            System.out.println("Enter a valid number!");
            return -1;
        } else {
            return n * factorialUsingRecursion(n - 1);//at line 51 we can see the recursive call symbol too.
        }
        //Now here do remember that a 3-line recursive code might look simple but there is top of processing as call to recursive method may lead to many more calls.
        //And none of the recursive call, in teh call stack gets returned until teh received teh result from the method that the invoked recursively.
        //So we do need a base case or breaking condition in recursion otherwise it will, keep going until stack is overflowed.
    }
    //Now here's something interesting,
    //The iterative implementation usually runs faster and doesn't use that much memory because there is overhead involved in pushing method calls on to the call stack
    //and each stack frame uses some memory.
    //But sometime the iterative way isn't that intuitive, and if it is it would be lot of lines of code.
    //When we are dealing with recursion the call stack can be referred as recursion stack too.
    //IT IS POSSIBLE TO GET STACK OVERFLOW EXCEPTION EVEN YOU DO HAVE A BASE CASE/BREAKING CONDITION.
    //LETS SAY IF YOU WRITE A RECURSION METHOD THAT INVOKES 10000 TIMES IT WILL OVERFLOW THE CALL STACK SIZE, HENCE THE ERROR APPEARS.
    //https://www.geeksforgeeks.org/tail-recursion/
    //https://stackoverflow.com/questions/33923/what-is-tail-recursion#:~:text=Tail%20recursion%20refers%20to%20the,begins%20popping%20the%20call%20stack.
    //A tail-recursive function is just a function whose very the last action is a call to itself. Java does not directly support TCO at the compiler level,
    //but with the introduction of lambda expressions and functional interfaces in JAVA 8, we can implement this concept in a few lines of code.
}