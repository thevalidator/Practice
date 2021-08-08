/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thekrechetofficial.binarypractice;

/**
 *
 * @author theValidator
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("INTEGER TO BINARY:");
        int num = 100500;
        System.out.println(ViewFormatter.getSBFormattedView(num));
        System.out.println(ViewFormatter.getBOFormattedView(num));
        
        
        System.out.println("\n\nTEST WITH LOOP:");
        int a = -1;
        System.out.printf("""
                          min value    : %s
                          min value - 1: %s
                          max value    : %s
                          max value + 1: %s
                          """, 
                Integer.toBinaryString(Integer.MIN_VALUE),
                Integer.toBinaryString(Integer.MIN_VALUE - 1), 
                Integer.toBinaryString(Integer.MAX_VALUE), 
                Integer.toBinaryString(Integer.MAX_VALUE + 1));
        
        System.out.println("\n\nTEST WITH BITS MOVING:");
        for (int i = 0; i < 32; i++) {
            int b = a >>> i;
            int c = a >> i;
            int d = a << i;
            System.out.printf("%2d:%33s %12d %33s %12d %33s %12d\n", i, Integer.toBinaryString(d), 
                    d, Integer.toBinaryString(b), b, Integer.toBinaryString(c), c);
        }

        
    }
   
}
