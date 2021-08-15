package com.thekrechetofficial.binarypractice;

/**
 *
 * @author theValidator
 */
public class Main {

    public static void main(String[] args) {
        
        boolean bool = true;    // 1 bit
        
        byte b = 120;           //  8 bits [-128 --> 127]
        short s = 255;          // 16 bits [-32_768 --> 32_767]
        
        int i = 6;              // 32 bits [-2147483648 --> 2147483647]
        long l = 12;            // 64 bits [-2^63 --> 2^63-1]
        
        float f = 14.3F;        // 32 bits [-3.4e38 --> 3.4e38]
        double d = 193.5;       // 64 bits [-1.7e308 --> 1.7e308]

        Demonstrations.calculationError();
        System.out.println("\n");

        Demonstrations.printIntegerInBits(100234);
        System.out.println("\n");
        
        Demonstrations.printLoopTest();
        System.out.println("\n");
        
        Demonstrations.printMovingBitsTest(32);
        System.out.println("\n");
        
        Demonstrations.printNumsInDifferentRadix();
        System.out.println("\n");
        
        Demonstrations.printEvenOddsFromZeroToNum(15);
        System.out.println("\n");
        
        Demonstrations.powTenDemonstration(3);
        System.out.println("\n");
        
        
   
    }

}
