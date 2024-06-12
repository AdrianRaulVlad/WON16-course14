package org.example.exerciseOne;

public class SumOfFirstN {
    // Recursive method to calculate the sum of first n integers
    public int sum(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n + sum(n - 1);
        }
    }
}
