package beginner.controlstructures;

import java.util.Scanner;

// Even/Odd Checker: Check if a number is even or odd.
public class EvenOddChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("The number is a even number.");
        }
        else {
            System.out.println("The number is a odd number.");
        }
    }
}
