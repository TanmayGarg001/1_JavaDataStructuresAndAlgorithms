package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Merge sort works on the principle of divide and conquer algorithm.
        //Its recursive in nature.
        //It has sort of 2 phases in it for easier understanding :- splitting and merging.
        //splitting phase leads to faster sorting during the merging phase.
        //splitting is logical in nature, we don't create new arrays.

        //We start with unsorted array, now we divide that it into 2 equal parts:- left and right.
        //We further split them into 2 equal-parts and further them into 2 equal-parts and keep on going till all the arrays
        //have only one element each, now these are sorted arrays.

        //Now in merging phase we merge every left/right of sibling arrays into a sorted array.
        //After the first merge, we'll have a bunch of 2-element sorted arrays.
        //Then merge those sorted arrays to end up with a bunch of 4-element sorted arrays.
        //We keep repeating this until we have a single sorted array.
        //Not in place algorithm, as it uses temporary arrays.
        //When we do the merge we first merge the sibling arrays first then we start moving upward.
        //Here merge means that we are sorting.
        //See the image for more clear visualization.
        //Stable algo, O(nlogn) base 2
        //https://www.youtube.com/watch?v=TzeBrDU-JaY

        int[] myIntArray = new int[7];

        myIntArray[0] = 20;
        myIntArray[1] = 35;
        myIntArray[2] = -15;
        myIntArray[3] = 7;
        myIntArray[4] = 55;
        myIntArray[5] = 1;
        myIntArray[6] = -22;

        System.out.println("Before Sorting :- " + Arrays.toString(myIntArray));
        //To understand this we wrote two functions one that keeps on splitting the array into further parts and other function merges the array and we get a sorted array finally.
        mergeSort(myIntArray);
    }

    // [20, 35, -15, 7, 55, 1, -22]
    public static void mergeSort(int[] inputArray) {
        if (inputArray.length < 2) {//this means we have only one element and that is already sorted.
            return;
        }
        int mid = inputArray.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[inputArray.length - mid];
        //Now we need to copy the elements in both of the arrays
        for (int i = 0; i < mid; i++) {
            leftArray[i] = inputArray[i];
        }
        for (int i = mid; i < inputArray.length; i++) {
            rightArray[i - mid] = inputArray[i];
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, inputArray);
    }

    public static void merge(int[] leftArray, int[] rightArray, int[] inputArray) {

    }
}
