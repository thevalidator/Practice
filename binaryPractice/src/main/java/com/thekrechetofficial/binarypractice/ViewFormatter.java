/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thekrechetofficial.binarypractice;

public class ViewFormatter {

    private static final int fourMb = 32;
    private static final int eightMb = 64;

    public static String getSBFormattedView(int number) {
        long start, end;
       
        String bits = Integer.toBinaryString(number);
        char[] bitsArray = bits.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append("String operations: ").append(number).append(" --> ");
        
        start = System.nanoTime();
        int suit = number < 0 ? 1 : 0;
        for (int i = 0; i < fourMb; i++) {
            if (i > 0 && i % 4 == 0) {
                sb.append(" ");
            }
            if (i >= (fourMb - bitsArray.length)) {
                sb.append(bitsArray[i - (fourMb - bitsArray.length)]);
            } else {
                sb.append(suit);
            }
        }
        end = System.nanoTime();
        sb.append(" Duration time in nanosecs: ").append(end - start);

        return sb.toString();
    }

    public static String getBOFormattedView(int number) {
        long start, end;
                
        StringBuilder result = new StringBuilder();
        result.append("Bits operations:   ").append(number).append(" --> ");
        
        start = System.nanoTime();
        int groupSize = 4;
        for (int i = 31; i >= 0; i--) {
            int mask = 1 << i;
            result.append((number & mask) != 0 ? "1" : "0");

            if (i % groupSize == 0) {
                result.append(" ");
            }
        }
        //result.replace(result.length() - 1, result.length(), "");
        end = System.nanoTime();
        result.append("Duration time in nanosecs: ").append(end - start);
        

        return result.toString();
    }

}
