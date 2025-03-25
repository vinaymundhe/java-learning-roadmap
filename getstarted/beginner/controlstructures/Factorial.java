package beginner.controlstructures;

import java.util.Scanner;

// Factorial: Calculate the factorial of a number using both for and while loops.
public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for factorial:");
        int number = input.nextInt();
        long factorialFor = 1;

        for (int i= 1; i <= number; i++){
            factorialFor *= i;
        }
        System.out.println("Factorial (using for loop): " + factorialFor);

        // Using while loop
        long factorialWhile = 1;
        int i = 1;
        while (i <= number) {
            factorialWhile *= i;
            i++;
        }
        System.out.println("Factorial (using while loop): " + factorialWhile);

        input.close();
    }
}
