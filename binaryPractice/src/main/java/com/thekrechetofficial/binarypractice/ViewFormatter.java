package com.thekrechetofficial.binarypractice;

public class ViewFormatter {

    private static final int FOUR_BYTES = 32;
    private static final int EIHGT_BYTES = 64;

    public static String getFormattedFourBytesBitsViewBitsOpWithData(int number) {
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
        
        end = System.nanoTime();
        result.append("Duration time in nanosecs: ").append(end - start);

        return result.toString();
    }
    
    public static String getFormattedFourBytesBitsViewBitsOp(int number) {

        StringBuilder result = new StringBuilder();

        int groupSize = 4;
        for (int i = 31; i >= 0; i--) {
            int mask = 1 << i;
            result.append((number & mask) != 0 ? "1" : "0");

            if (i % groupSize == 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static String getFormattedFourBytesBitsViewStringOp(int number) {

        String bits = Integer.toBinaryString(number);
        char[] bitsArray = bits.toCharArray();
        StringBuilder sb = new StringBuilder();

        int suit = number < 0 ? 1 : 0;
        for (int i = 0; i < FOUR_BYTES; i++) {
            if (i > 0 && i % 4 == 0) {
                sb.append(" ");
            }
            if (i >= (FOUR_BYTES - bitsArray.length)) {
                sb.append(bitsArray[i - (FOUR_BYTES - bitsArray.length)]);
            } else {
                sb.append(suit);
            }
        }

        return sb.toString();
    }

    public static String getFormattedFourBytesBitsViewStringOpWithData(int number) {
        long start, end;

        String bits = Integer.toBinaryString(number);
        char[] bitsArray = bits.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append("String operations: ").append(number).append(" --> ");

        start = System.nanoTime();
        int suit = number < 0 ? 1 : 0;
        for (int i = 0; i < FOUR_BYTES; i++) {
            if (i > 0 && i % 4 == 0) {
                sb.append(" ");
            }
            if (i >= (FOUR_BYTES - bitsArray.length)) {
                sb.append(bitsArray[i - (FOUR_BYTES - bitsArray.length)]);
            } else {
                sb.append(suit);
            }
        }
        end = System.nanoTime();
        sb.append(" Duration time in nanosecs: ").append(end - start);

        return sb.toString();
    }

//    public static String getFormattedViewLong(long number) {
//
//        StringBuilder result = new StringBuilder();
//
//        int groupSize = 4;
//        for (int i = 31; i >= 0; i--) {
//            int mask = 1 << i;
//            result.append((number & mask) != 0 ? "1" : "0");
//
//            if (i % groupSize == 0) {
//                result.append(" ");
//            }
//        }
//
//        return result.toString();
//    }

}
