
package com.rafsan.day2;

/**
 * print your name 1000 times without using any loop in your code
 * @author Arif Rafsan
 */
public class PrintName {
    public static void main(String[] args) {
        String name = "Rafsan";
        String v = "a";
        v = v.replaceAll("a", "aaaaaaaaaa");//10
        v = v.replaceAll("a", "aaaaaaaaaa");//10 * 10 = 100
        v = v.replaceAll("a", "aaaaaaaaaa");//100 * 10 = 1000
        
        v = v.replaceAll("a", name + "\n");
        System.out.println(v);
        
    }
}
