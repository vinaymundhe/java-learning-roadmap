package beginner.functions;

import java.util.Scanner;

// Prime Number Check (Function): Write a method to determine if a number is prime.
public class PrimeNumberCheck {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        // Check for divisibility from 2 to the square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 17;

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}