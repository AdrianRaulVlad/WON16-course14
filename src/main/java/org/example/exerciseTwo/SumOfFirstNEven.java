package org.example.exerciseTwo;

public class SumOfFirstNEven {
    // Recursive method to calculate the sum of the first n even integers
    public int sumEven(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return (2 * n) + sumEven(n - 1);
        }
    }
}
