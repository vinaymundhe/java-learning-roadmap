package beginner;

import java.util.Scanner;

// Basic Arithmetic: Take two numbers as input and display their sum, difference, product, and quotient.

public class BasicArithmetic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = input.nextDouble();

        double addition = num1 + num2;
        double substraction = num1 - num2;
        double multiply = num1 * num2;
        double divide = num1 / num2;

        System.out.println("Addition: "+addition);
        System.out.println("Substraction: "+substraction);
        System.out.println("Multiplication: "+multiply);
        System.out.println("Divide: "+divide);
    }
}
