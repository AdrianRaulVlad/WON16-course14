package org.example.exerciseFive;

public class FibonacciCalculator {
    // Method to get the n-th Fibonacci number using recursion
    public int getFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Index cannot be negative");
        }
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }
}
