package beginner.miniprojects;

import java.util.Random;
import java.util.Scanner;

/*
Number Guessing Game:

Generate a random number between 1 and 100.
Let the user guess the number.
Provide feedback if the guess is too high or too low.
End the game when the user guesses correctly and display the number of attempts.
 */
public class NumberGuessingGame {
    public static void main(String[] args) {

        Random rand = new Random();
        int randomNum = rand.nextInt(100);

        Scanner scn = new Scanner(System.in);
        System.out.println("Guess a random Number from 0-100: ");
        int userInput = scn.nextInt();

        if (userInput == randomNum){
            System.out.println("You have guessed the right number!! Congratulations!!!");
        } else if (userInput > randomNum) {
            System.out.println("Your guess is too high!");
            System.out.println("The correct number was: "+randomNum);
        } else {
            System.out.println("Your guess is too low!");
            System.out.println("The correct number was: "+randomNum);
        }
    }
}