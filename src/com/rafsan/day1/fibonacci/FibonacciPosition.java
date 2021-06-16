package com.rafsan.day1.fibonacci;

import java.util.Scanner;

/**
 *
 * @author Arif Rafsan
 */
public class FibonacciPosition {

    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num, i, count;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input fibonacci number position:");
        count = scanner.nextInt();

        System.out.println("1 Fibonacci number is\t" + num1);
        System.out.println("2 FIbonacci number is\t" + num2);

        for (i = 2; i < count; i++) {
            num = num1 + num2;
            num1 = num2;
            num2 = num;
            System.out.println((i+1) + " Fibonacci number is\t" + num2); // i+1 for position
        }

    }
}
