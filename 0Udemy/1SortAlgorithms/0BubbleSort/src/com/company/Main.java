package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //called bubble sort coz bubbles rise up at the top so the higher sorted values goes into the sorted partition after every loop.
        //and we keep comparing the unsorted elements to one another and send them to sorted partition using a loop.

        //It is an in-place algorithm means it does not make any new array instance or any other data structure in memory whilst sorting,
        //it does make few local variables but they don't grow as number of items keep increasing. Basically it uses itself only no extra memory needed.It's fine to use
        //local variables.

        //O(n^2) time complexity. So algorithm degrades quickly.

        int[] myIntArray = new int[7];

        myIntArray[0] = 20;
        myIntArray[1] = 35;
        myIntArray[2] = -15;
        myIntArray[3] = 7;
        myIntArray[4] = 55;
        myIntArray[5] = 1;
        myIntArray[6] = -22;

        System.out.println("Before Sorting :- " + Arrays.toString(myIntArray));

        //Now there can be many implementations of the same algorithm this is just one of these.
        //Also many algos use swap technique to sort so we'll just make a method for that.


        //As we want unsorted partition to vanish so we decrement the loop as initially all are unsorted so it goes from array.length to 0
        //And inside that we want the sorted partition to increase from 0 to array.length-1  and to run till the unsortedIndex. as we don't want to mess with sorted index.

        for (int unsortedIndex = myIntArray.length - 1; unsortedIndex > 0; unsortedIndex--) {
            //So after each iteration of the outer loop sorted partition grows by one
            for (int j = 0; j < unsortedIndex; j++) {//We are growing sorted partition from right to left
                if (myIntArray[j] > myIntArray[j + 1]) { // change the > sign and array arranges to descending order.
                    swap(myIntArray, j, j + 1);
                }
            }
            //it is a bit optimized strictly speaking bubbleSort want us to traverse the entire array every time no matter where the sorted partition is
            //and then it comes out to be O(n^2). But here we are increasing the sorted partition and the unsorted partition does not cross after that
            //So its not strictly O(n^2) but still a bigger picture will lead to approximation O(n^2). We don't wanna do maths here we just see the number of steps.
            //That's what an algorithm is.Number of series of step to perform to accomplish a specific task.
            //See the number of loops.To calculate time complexity.

            //BTW ITS MOST USELESS ALGORITHM AS IT IS VERY INEFFICIENT.
        }

        System.out.println("After Sorting :- " + Arrays.toString(myIntArray));

    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
            //nothing to do if same index.
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        //values swapped

    }

}
