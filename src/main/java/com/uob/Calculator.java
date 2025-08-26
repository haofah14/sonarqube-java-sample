package com.uob;

public class Calculator {
    public int divide(int a, int b) {
        try {
            return a / b; // Bug: divide by zero possible if b=0
        } catch (Exception e) { // Code Smell: empty catch block
        }
        int unusedVar = 100; // Code Smell: unused variable
        return 0;
    }
}
