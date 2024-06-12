package org.example.exerciseFour;

public class SumOfDigits {
    // Recursive method to calculate the sum of digits of a number
    public int sumOfDigits(int number) {
        // Base case: if the number is a single digit, return the number
        if (number < 10 && number > -10) {
            return number;
        }

        // Recursive case: sum the last digit and call the method with the rest of the number
        return (number % 10) + sumOfDigits(number / 10);
    }
}
