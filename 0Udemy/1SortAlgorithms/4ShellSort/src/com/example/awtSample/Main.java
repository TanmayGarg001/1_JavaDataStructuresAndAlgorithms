package com.example.awtSample;

import java.util.Arrays;

//if the sequence of values that we are sorting are nearly sorted, than insertion sort will result in fastest result reaching to almost O(n) time.
//Now a computer scientist realized that if we could down the amount of shifting in insertion sort it would run even faster and made a variation to it.
//That's the shell sort algorithm.
public class Main {

    public static void main(String[] args) {
        //Insertion sort chooses which  element to insert using a gap of 1. Shell sort uses a larger gap value initially as algorithm runs it makes the array
        //somewhat sorted and when the gap is reduced to 1 it does the insertion sort again and whole array is sorted.
        //Now the question comes how much larger gap value should we consider?
        //Now there are ton of theories  about this, https://en.wikipedia.org/wiki/Shellsort see this link

        //Knuth sequence is used generally.See the pic
        int[] myIntArray = new int[7];

        myIntArray[0] = 20;
        myIntArray[1] = 35;
        myIntArray[2] = -15;
        myIntArray[3] = 7;
        myIntArray[4] = 55;
        myIntArray[5] = 1;
        myIntArray[6] = -22;

        //it is an in place algorithm, complexity varies depending upon the gap worst is O(n^2), but it can perform much better than that
        //it doesn't require that much shifting as insertion sort.
        //BUT THIS IS UNSTABLE ALGORITHM AS GAP OF MORE THAN 1 LEADS TO THAT.
        //also we could apply this on bubble sort to decrease amount of swapping it has to do.
        System.out.println("Initial array :- " + Arrays.toString(myIntArray));
        //for simplicity we're just gonna use gap equals to the half of the array size.
        for (int gap = myIntArray.length / 2; gap > 0; gap = gap / 2) {
            //now its similar to insertion sort
            for (int i = gap; i < myIntArray.length; i++) {
                int temp = myIntArray[i];
                int j = i;
                while (j >= gap && myIntArray[j - gap] > temp) {
                    myIntArray[j] = myIntArray[j - gap];
                    j = j - gap;
                    System.out.println(myIntArray[j] + " swapped " + myIntArray[j + 1]);
                }
                myIntArray[j] = temp;
            }
        }


        System.out.println("Final array :- " + Arrays.toString(myIntArray));
    }
}
