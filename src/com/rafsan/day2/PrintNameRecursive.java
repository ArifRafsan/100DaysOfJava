package com.rafsan.day2;

/**
 * print your name 1000 times without using any loop in your code
 * recursive is not recommended because of "StackOverFlowError"
 * @author Arif Rafsan
 */
public class PrintNameRecursive {
    private static int counter = 1;
    public static void main(String[] args) {
        if( counter <= 1000){
            System.out.println(counter+ " Rafsan");
            counter++;
            main(null);
        }        
    }
}
