package com.thekrechetofficial.binarypractice;

/**
 *
 * @author theValidator
 */

public class Demonstrations {

    public static void printIntegerInBits(int number) {
        System.out.println(">>>>>  INTEGER TO BINARY:");
        System.out.println(ViewFormatter.getFormattedFourBytesBitsViewBitsOpWithData(number));
        System.out.println(ViewFormatter.getFormattedFourBytesBitsViewStringOpWithData(number));
    }

    public static void printLoopTest() {
        System.out.println(">>>>>  LOOP:");
        System.out.printf("""
                          [min value]     : %s
                          [max value]     : %s
                          
                          [min value - 1] : %s
                          [max value + 1] : %s
                          
                          [min value + 1] : %s
                          [max value - 1] : %s
                          """,
                ViewFormatter.getFormattedFourBytesBitsViewBitsOp(Integer.MIN_VALUE),
                ViewFormatter.getFormattedFourBytesBitsViewBitsOp(Integer.MAX_VALUE),
                ViewFormatter.getFormattedFourBytesBitsViewBitsOp(Integer.MIN_VALUE - 1),
                ViewFormatter.getFormattedFourBytesBitsViewBitsOp(Integer.MAX_VALUE + 1),
                ViewFormatter.getFormattedFourBytesBitsViewBitsOp(Integer.MIN_VALUE + 1),
                ViewFormatter.getFormattedFourBytesBitsViewBitsOp(Integer.MAX_VALUE - 1));
    }

    public static void printMovingBitsTest(int number) {
        System.out.println(">>>>>  BITS MOVING:");
        System.out.printf("number: %d / %s \n", number, Integer.toBinaryString(number));
        System.out.println("q-ty               <<             \t\t\t\t           >>>  \t                                  >> ");
        for (int i = 0; i < 32; i++) {
            int b = number >>> i;
            int c = number >> i;
            int d = number << i;
            System.out.printf("%2d: %33s %12d %33s %12d %33s %12d\n", i,
                    Integer.toBinaryString(d), d, Integer.toBinaryString(b),
                    b, Integer.toBinaryString(c), c);
        }
    }

    public static void printNumsInDifferentRadix() {
        System.out.println(">>>>>  INTEGER    BINARY    HEX");
        for (int i = 0; i < 16; i++) {
            System.out.printf("%4d %11s %6s\n", i, Long.toBinaryString(i), Long.toHexString(i));
        }
    }

    public static void printEvenOddsFromZeroToNum(int number) {
        System.out.println(">>>>>  EVEN / ODDS");
        for (int i = 0; i <= number; i++) {
            if ((i & 1) != 1) {
                System.out.printf("%3d: even\n", i);
            } else {
                System.out.printf("%3d: odd\n", i);
            }
        }
    }
    
    public static void powTenDemonstration(int number) {
        System.out.println(">>>>>  POW DEMOSTRATION:");
        int result = 1;
        System.out.printf("pow: %2d\t\tbinary: %s\tresult: %11d  \n", 0, ViewFormatter.getFormattedFourBytesBitsViewStringOp(1), 1);
        for (int i = 1; i <= 10; i++) {
            result *= number;
            System.out.printf("pow: %2d\t\tbinary: %s\tresult: %11d  \n", i, ViewFormatter.getFormattedFourBytesBitsViewStringOp(result), result);
        }
    }
    
    public static void calculationError() {
        System.out.println(">>>>>  CALCULATION ERROR:");
        
        float f = 0.3F;
        double d = 0.3;
        
        System.out.printf(" float 0.3 + 0.3 + 0.3 = ");
        System.out.println(f+f+f);
        System.out.printf("double 0.3 + 0.3 + 0.3 = ");
        System.out.println(d+d+d);
        System.out.println();
        System.out.printf(" float 0.3 x 3 = ");
        System.out.println(f*3);
        System.out.printf("double 0.3 x 3 = ");
        System.out.println(d*3);
        System.out.println("");
        System.out.println("Float 0.3 in bits:           " + ViewFormatter.getFormattedFourBytesBitsViewStringOp(f));
        System.out.println("");
        System.out.println("Float 0.6 in bits:           " + ViewFormatter.getFormattedFourBytesBitsViewStringOp(0.6f));
        System.out.println("Float [0.3+0.3] in bits:     " + ViewFormatter.getFormattedFourBytesBitsViewStringOp(f+f));
        System.out.println("");
        System.out.println("Float 0.9 in bits:           " + ViewFormatter.getFormattedFourBytesBitsViewStringOp(0.9f));
        System.out.println("Float [0.3+0.3+0.3] in bits: " + ViewFormatter.getFormattedFourBytesBitsViewStringOp(f+f+f));
        System.out.println("\n");
        System.out.println("Double 0.3 in bits: " + ViewFormatter.getFormattedEightBytesBitsViewStringOp(d));
        System.out.println();
        System.out.println("Double 0.6 in bits: " + ViewFormatter.getFormattedEightBytesBitsViewStringOp(0.6));
        System.out.println("Double res in bits: " + ViewFormatter.getFormattedEightBytesBitsViewStringOp(d+d));
        System.out.println();
        System.out.println("Double 0.9 in bits: " + ViewFormatter.getFormattedEightBytesBitsViewStringOp(0.9));
        System.out.println("Double res in bits: " + ViewFormatter.getFormattedEightBytesBitsViewStringOp(d+d+d));
        
        
        
        
        
        
       
    }

}
