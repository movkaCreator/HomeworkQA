package com.aston;

public class App {
    public static void main( String[] args ) {
        System.out.println(factorial(6));
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Отрицательное число.");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
