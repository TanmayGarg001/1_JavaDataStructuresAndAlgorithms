package com.company;

import java.util.Arrays;

public class Main {
    //Video link :-
    //https://youtu.be/wWhAhp6PIuQ
    public static void main(String[] args) {
        //MAIN THING IS THE SORTED AND UNSORTED PARTITION DIRECTION AND WE DON'T SWAP THE ELEMENTS WE SHIFT THEM.So, we don't need swap method.
        //Insertion sort also divides the array into 2 parts :- sorted and unsorted.
        //Here we assume the very 1st element of the array to be sorted and rest of the array is unsorted.
        //and we move the sorted partition from left to right in this method of sorting.(opposite to that of bubble and selection sort.)

        //Now in each iteration we take the first element in the unsorted partition and we insert it into the sorted partition.
        //to do that the element that is to be inserted is compared with each element in the sorted partition from right to left as it will require less steps ofc.
        //and we look for the value that is less than or equal to the value that we're trying ot insert, because once we find that we can stop looking as the values
        //to the left of that will be smaller as compared to the value that we are inserting.
        //now when we insert the value inside the sorted partition ,the values that would be on right of the inserted value gets displaced or shifted by +1 index.
        //And this whole process keeps repeating and at last we get a sorted array.
        //It doesn't require swap() method as we shift elements here.

        //In Place algorithm
        //O(n^2) time complexity.Stable algorithm.

        int[] myIntArray = new int[7];

        myIntArray[0] = 20;
        myIntArray[1] = 35;
        myIntArray[2] = -15;
        myIntArray[3] = 7;
        myIntArray[4] = 55;
        myIntArray[5] = 1;
        myIntArray[6] = -22;

        System.out.println("Before Sorting :- " + Arrays.toString(myIntArray));

        //Outer loop is the one that grows the sorted partition by one and inner loop looks for the position where to insert the element
        //basically outer loop goes in ----> direction
        //and inner loop goes in <---- direction

        for (int i = 1; i < myIntArray.length; i++) {//outer loop i here is unsortedIndex
            int temp = myIntArray[i];
            int j = i - 1;//sortedIndex
            while (j >= 0 && myIntArray[j] > temp) {
                myIntArray[j + 1] = myIntArray[j];
                j--;
            }
            myIntArray[j + 1] = temp;
        }
        System.out.println("After Sorting :- " + Arrays.toString(myIntArray));

    }

}
