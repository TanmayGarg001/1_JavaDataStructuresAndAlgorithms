package com.company;

public class Main {
//Watch these 3 videos in order :-
    //https://www.youtube.com/watch?v=vgSKOMsjLbc
    //https://www.youtube.com/watch?v=5g7K86jYto8
    //https://www.youtube.com/watch?v=STL8ESuETmM
    public static void main(String[] args) {

        //To compare the performance of one algorithm over the other , what we could do is we can record the time(end time of an algo-start time of an algo).
        //and based on that we could conclude which algorithm is faster.
        //This sounds good in theory but its not a good way to do it because of hardware. As it will influence the running time of these algos.
        //For example if a super computer vs a computer of 1990's were to run same algo, super computer would run it easily even though the algorithm
        //might be really really inefficient on the other hand 1990's computer might straight away crash.

        //So we need a more objective measure than just the straight running time.
        //So what we do is we look at the number of steps that it takes to execute an algorithm.And we call this the time complexity.
        //2 types of complexity are there :- time and space(memory).
        //Time complexity is the number of steps involved to execute an algorithm
        //Memory complexity is the one which deals with the memory management to run an algorithm.
        //These days as memory is cheap, so we mainly concern about time complexity.

        //We concern about the worst case of time complexity as best case rarely happens.
        //And average case won't tell us about the absolute worst time complexity either.
        //So we see the upper bound of an algorithm that is the worst case.

        //Now lets say you have to make tea in 4 steps and 5th step is to repeat step3&4 if you want more sugar.
        //So if Arun takes one sugar it takes 4 steps for him.
        //If Sam takes two sugars it takes 6 steps for him.
        //If Lola takes three sugars it takes 8 steps for her.
        //And this keeps going on...
        //So time complexity gives us an idea of how an algorithm will perform as the number of items it has to deal with keeps growing.
        //therefore some algos scale good and some not so good. Here scale means how algo will perform if we are to deal with 100 items or 10000 items or a billion items.
        //so more items there are the more performance degrades.

        //SO THE BIG O NOTATION IS A WAY OF EXPRESSING THE COMPLEXITY RELATED TO NUMBER OF ITEMS THAT AN ALGO HAS TO DEAL WITH.
        //So in tea example total number of steps will be 2n + 2 as 2n grows but 2 is the step 1&2 which are constant and don't factor into our
        //time complexity.So here the two 2's in this 2n+2 are constant.
        //Only "n" will factor into our time complexity as it keeps on growing the more sugar you need
        //So its Time Complexity is shown as :- "O(n)."
        //As you can see clearly it is linearly scaled.
        //Linear time complexity.
        //Some of the Big-O values are :-
        //O(1) = constant
        //O(logn) = logarithmic (this is log to the base 2)
        //O(n) = linear
        //O(nlogn) = linearithmic
        //O(n^2) = quadratic

        //We say these like O of n or O of n square etc etc.
        //See this awesome video by colt steele to understand this in a way that you will never forget!
        //link :- https://www.youtube.com/watch?v=kS_gr2_-ws8

    }
}
