package com.rafsan.day1.fibonacci;

/**
 *
 * @author Arif Rafsan
 */
public class FibonacciExample {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1,num=0,  i, count = 10;
               
        System.out.println("0 Fibonacci number is\t"+num1);
        System.out.println("1 FIbonacci number is\t"+num2);
        
        for( i = 2; i <= count ; i ++){
            num = num1 + num2; 
            num1 = num2;
            num2 = num;
            System.out.println(i+"th Fibonacci number is\t"+num2); 
        }
        
        
    }
}
