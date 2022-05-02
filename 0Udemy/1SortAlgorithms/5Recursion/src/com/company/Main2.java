package com.company;

public class Main2 {
    private static int stepCount1 = 0;
    private static int stepCount2 = 0;

    public static void main(String[] args) {
//        recursionInfinite();
//        System.out.println(sum(8));
        System.out.println(power(5, 10000) + " ,steps: " + stepCount1);//here time complexity O(n). Also integer overflow ignore that for now.
        System.out.println(powerFast(5, 10000) + " ,steps: " + stepCount2);//here time complexity O(logn). Also integer overflow ignore that for now.
        System.out.println(nCrossMGrid(10, 10));
    }

    public static void recursionInfinite() {
        //Exception in thread "main" java.lang.StackOverflowError
        System.out.println("Stack Overflow!");
        recursionInfinite();
    }

    public static int sum(int n) {
        //sums number from 1 to n.
        //base case(simplest possible input for this function)
        if (n == 1) {
            return 1;
        }
        return sum(n - 1) + n;
    }

    public static int power(int a, int b) {
        //solve a^b
        stepCount1++;
        if (b == 0) {
            return 1;
        }
        return a * power(a, b - 1);

    }

    public static int powerFast(int a, int b) {
        //solve a^b
        stepCount2++;
        if (b == 0) {
            return 1;
        } else if (b % 2 == 0) {
            return powerFast(a * a, b / 2);
        } else {
            return a * powerFast(a, b - 1);
        }

    }

    public static int nCrossMGrid(int n, int m) {
        //find number of paths in n*m grid provided that you can move in bottom and right direction only.
        if (n == 1 || m == 1) {
            return 1;
        }
        return nCrossMGrid(n, m - 1) + nCrossMGrid(m, n - 1);
    }


}
