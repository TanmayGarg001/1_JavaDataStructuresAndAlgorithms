package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myIntArray = new int[7];
        //Arrays are not dynamic in nature. means once we have created an array instance you cannot change its size;
        //So we can't increase or decrease its size so this leads to some disadvantages.
        //Arrays are 0 indexed based.

        myIntArray[0] = 20;
        myIntArray[1] = 35;
        myIntArray[2] = -15;
        myIntArray[3] = 7;
        myIntArray[4] = 55;
        myIntArray[5] = 1;
        myIntArray[6] = -22;

        System.out.println(Arrays.toString(myIntArray));

        //Or I can use for loop too.
        //Array is a contiguous block in the memory.
        //Lets say an array start at memory address 100 (just an example)(irl memory addresses are like 0x008000ff - you can see this in registry editor)
        //So if array is 200 bytes long its going to store 200 bytes after 100 address in continuous manner.
        //That's why we have to specify the length of the array when we create it, as it tells the JVM how much memory it has to allocate for that array.
        //And that's why they can't be resized. Because if they could, there would be no guarantee if we added an extra space in the array that , this extra space is added
        //in the some contiguous memory block.So they are not scattered over the memory.

        //And every element in array occupies the same size as they are made of same data types.So in an int array every item in array is having 4byte of space
        //And when were working with objects object reference is stored in the variable not the actual value.and the object references are always of the same size
        //regardless of the object they are referring to.

        //As each element is having same size in array we can easily calculate each memory address in the array based on its index. For example:-
        //if the array starts at memory address 'x' and each element takes space 'y'. So the memory address of ith element will be x+i*y.
        //So if we know the index of an element,the time to retrieve the element will be same,no matter where it is in the array.

        //SO FOR ARRAY THAT WE MADE ABOVE (myIntArray) it would look something like this :-
        //Lets say start address of array is 12 and as it is integer array so element size is 4 bytes. Therefore,
        //Address of myIntArray[0] = 12 + 0*4 = 12
        //Address of myIntArray[1] = 12 + 1*4 = 16
        //Address of myIntArray[2] = 12 + 2*4 = 20
        //Address of myIntArray[3] = 12 + 3*4 = 24
        //Address of myIntArray[4] = 12 + 4*4 = 28
        //Address of myIntArray[5] = 12 + 5*4 = 32
        //Address of myIntArray[6] = 12 + 6*4 = 36

        //THIS IS FUCKING WHY ARRAYS ARE 0 INDEX BASED! BECAUSE OF THEY STARTED AT ONE THEN WE HAD TO SUBTRACT THE SIZE OF THE ELEMENT EACH TIME.

        //SO IF WE KNOW THE INDEX OF THE ELEMENT WE WANT, WE CAN GET TO THAT ELEMENT LIGHTNING FAST REGARDLESS OF THE FACT WHERE THE ELEMENT IS IN THE ARRAY!
        //SO ARRAYS ARE VERY POWERFUL IN THAT MANNER!
        //They are also memory efficient because we don't have to store any extra information with each element in the array.
        //So it doesn't matter how many elements are there in the array we need only 3 steps to retrieve any element in that array.
        //That are := 1.multiply the size to the index ; 2.Get the start address of array; 3.Add these both and boom you've got the element.
        //So time complexity is O of one i.e. O(1). Fastest possible!
        //That is when the number of items increases the algorithm does not degrade at all.


        //NOW DISADVANTAGE OF ARRAY :- :(
        //In MyIntArray lets say you are asked to retrieve value 7 from the array but you do not know the index. That is the data is hidden or encrypted or stored in
        //a database or something.So all of a sudden we can't go right to the position in the array as we don't know the index for value 7.So to overcome this we make a
        //loop and check for each value using search algorithm binary or linear search depending on type of data. So now we couldn't just jump to 7 like we did previously.
        //So for Big O Notation we always consider the worst case, hence the worst case would be if the value asked to retrieve was in the end element of the array.
        //So, we have to search entire array and loop n times where n is number of elements in the array. So time complexity all of a sudden becomes linear i.e. O(n).
        //Also lets say if we have to add a new element in the array we can't do that as they are not resizable. So to overcome this we have to make a brand new array,
        //copy the elements of the previous array and add the element which also takes O(n) time.See the screenshot for some array operations time complexity :-
        //So in a nutshell, in array, if the code requires a loop time complexity would be O(n) . and we know the index then it is O(1).

    }
}
