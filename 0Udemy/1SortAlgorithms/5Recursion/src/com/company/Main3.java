package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println(Integer.MAX_VALUE);
        System.out.println("Answer = " + sumTillN(scanner.nextInt()));
    }

    public static int sumTillN(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + sumTillN(num - 1);
        }
    }
}
