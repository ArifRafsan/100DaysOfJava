
package com.rafsan.day1.fibonacci;

import java.util.Scanner;

/**
 *
 * @author Arif Rafsan
 */
public class FibonacciRecursion {
    static int printFibonacci(int n){
        if( n <= 1)
            return n;
        return printFibonacci(n-1) + printFibonacci(n- 2);
    }
    
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input number to nth fibonacci:");
        count = scanner.nextInt();
        
        System.out.println(count +"th Fibonacci number is: "+printFibonacci(count));
        
    }
}
