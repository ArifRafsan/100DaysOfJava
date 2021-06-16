package com.rafsan.day1.fibonacci;

import java.math.BigInteger;

/**
 *It's take 17s for 10lakh core i5, 8gb ram pc
 * 1min 12s for 20lakh
 * 2min 41s for 30lakh
 * 
 * Task: Use Multi-threading 
 * 
 * @author Arif Rafsan
 */
public class Fibonacci100th {
    static BigInteger printFibonacci(int n){
        BigInteger num;
        BigInteger num1 = BigInteger.valueOf(0);
        BigInteger num2 = BigInteger.valueOf(1);
        
        for(int i = 2; i <=n ; i++){
            num = num1.add(num2);
            num1 = num2;
            num2 = num;
        }
        return (num2);
    }
    
    public static void main(String[] args) {
       int n = 100;
       //for taking input use scanner
        System.out.println("Fibonacci of  "+ n + "th term"  + " is " +  printFibonacci(n));
    }
}
