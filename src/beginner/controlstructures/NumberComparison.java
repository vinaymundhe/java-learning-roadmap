package beginner.controlstructures;

import java.util.Scanner;

// Number Comparison: Input three numbers and find the largest.
public class NumberComparison {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Enter third number: ");
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("First number ("+num1+") is the largest number.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Second number {"+num2+") is the largest number.");
        } else if (num3 > num1 && num3 > num2){
            System.out.println("Third number ("+num3+") is the largest number.");
        } else {
            System.out.println("Error: Multiple largest numbers.");
        }
    }
}