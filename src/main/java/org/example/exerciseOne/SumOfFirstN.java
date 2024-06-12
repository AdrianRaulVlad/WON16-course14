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

    public static void main(String[] args) {
        // Create an object of SumOfFirstN
        SumOfFirstN sumOfFirstN = new SumOfFirstN();

        // Test cases
        System.out.println("Sum of first 5 integers: " + sumOfFirstN.sum(5)); // Should print 15
        System.out.println("Sum of first 10 integers: " + sumOfFirstN.sum(10)); // Should print 55
        System.out.println("Sum of first 1 integer: " + sumOfFirstN.sum(1)); // Should print 1
        System.out.println("Sum of first 0 integers: " + sumOfFirstN.sum(0)); // Should print 0
    }
}
