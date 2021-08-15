package com.thekrechetofficial.nonsense;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

class First {
    int sum(int x, int y) {
        return (x+y);
    }
}

public class Main extends First {

    public static void main(String[] args) throws IOException {
        
        //breaking with label 
        label:
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(j);
                if (j == 1) {
                    break label;
                }
            }
        }
        
        //test with new Main class
        System.out.println("");
        Main m = new Main();
        System.out.println("sum=" + m.sum(5, 6));
        
        
        
        byte[] byteArray = new byte[256];
        try (FileInputStream fls = new FileInputStream("text.txt")) {
            fls.read(byteArray);
        }
        
        System.out.println(Arrays.toString(byteArray));
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
