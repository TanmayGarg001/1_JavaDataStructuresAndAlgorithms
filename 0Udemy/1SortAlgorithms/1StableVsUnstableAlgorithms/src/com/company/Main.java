package com.company;

public class Main {

    public static void main(String[] args) {
        //Two types are there Stable and UnStable algos.
        //They only deal with when we have 2 or more data types of the same values in our array.

        //Unstable Algo :-
        //Consider this array = 5 9 3 9' 8 4 (before sorting)
        //                      3 4 5 8 9' 9 (after sorting)
        ///Now before sorting the 9 was in front of 9' but after sorting it comes at back of 9'. This is Unstable sorting.
        //for stable sort it preserves the relative position of 9 and 9' in this case.
        //So it would look like :-
        //5 9 3 9' 8 4 (before sorting)
        //3 4 5 8 9 9' (after sorting)

        //So we prefer stable sort over the unstable sort. Because for integers it doesn't really matter but for objects it does!
        //For example bubble sort is a stable sort algorithm because it doesn't swap the values that are equal to each other.
        //All it takes to make it unstable is when we check if the ith element is greater than i+1 element.
        //If we add just an equals to, that is if ith element is greater than or equal to i+1 element it becomes unstable.
        //So be careful as we want stable algos.(Not bubble sort ofc it's a shitty algo)


    }
}
