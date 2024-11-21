package beginner;

import java.util.Scanner;

// User Input: Write a program to take your name and age as input and print it back.

public class UserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String username = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Name: " + username);
        System.out.println("Age: " + age);
    }
}