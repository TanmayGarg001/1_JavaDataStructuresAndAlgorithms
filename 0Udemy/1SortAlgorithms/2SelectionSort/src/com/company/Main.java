package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Here we assume the very first element to be largest and start comparing to the following elements in the array and when we find element larger than that
        //we make the largest element equal to that and keep doing this and at end we get the largest element which is at position array.length -1.
        //Now we do same thing again and start the inner loop again and it runs one less time because last item in array is sorted.
        //So the sorted partition keeps growing from right to left like we did in bubbleSort.
        //called selection sort because we select the very first element each time we traverse the array.

        //Time complexity is O(n^2).Algorithm degrades quickly.
        //In-place algorithm.
        //It only requires one swapping per traversal unlike bubble sort which required lot of swapping.
        //So generally it works faster than bubble sort.
        // Also ,it is an Unstable Algorithm.But we can make it stable ezPz.


        int[] myIntArray = new int[7];

        myIntArray[0] = 20;
        myIntArray[1] = 35;
        myIntArray[2] = -15;
        myIntArray[3] = 7;
        myIntArray[4] = 55;
        myIntArray[5] = 1;
        myIntArray[6] = -22;

        System.out.println("Before Sorting :- " + Arrays.toString(myIntArray));

        for (int unsortedIndex = myIntArray.length - 1; unsortedIndex > 0; unsortedIndex--) {
            int largest = 0;
            for (int j = 1; j <= unsortedIndex; j++) {
                if (myIntArray[j] >= myIntArray[largest]) {//ADD EQUAL TO HERE AND IT BECOMES STABLE ALGORITHM.
                    largest = j;
                }
            }
            swap(myIntArray, unsortedIndex, largest);
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
