package beginner.controlstructures;

import java.util.Scanner;

// Multiplication Table: Generate a multiplication table for a given number.
public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for multiplication table:");
        int multiNum = input.nextInt();

        System.out.println("Multiplication Table for "+multiNum+": ");

        for (int i=1; i <= 10 ; i++){
            int result = multiNum * i;
            System.out.println(result);
        }
    }
}