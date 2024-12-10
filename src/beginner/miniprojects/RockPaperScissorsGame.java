package beginner.miniprojects;

import java.util.Random;
import java.util.Scanner;

/*
Mini Project: Rock-Paper-Scissors Game
Requirements:

1. User and Computer Choices:
Prompt the user to enter "rock", "paper", or "scissors".
Generate a random choice for the computer using Math.random() or Random class.

2. Determine the Winner:
Compare user’s choice with the computer’s.
Print out who won or if it’s a tie.

3. Play Multiple Rounds:
Use a loop to allow multiple rounds of play.
Let the user decide when to stop playing.

4. Score Tracking (Optional):
Keep track of how many games the user has won vs. lost vs. tied.
Display the score after each round.
 */
public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] game = {"Rock", "Paper", "Scissors"};
        String userChoice, computerChoice;
        int Wins = 0, Losses = 0, Ties = 0;
        boolean keepPlaying = true;

        while (keepPlaying) {
            Random random = new Random();
            int randomString = random.nextInt(game.length);
            computerChoice = game[randomString];

            System.out.println("Pick any one: Rock, Paper, Scissors!!!");
            userChoice = scn.nextLine();

            if (userChoice.equals(computerChoice)) {
                System.out.println("The game has tied! Computer and you both chose " + computerChoice);
                Ties += 1;
            } else if (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors") || userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper") || userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) {
                System.out.println("Congrats...You Won!! Computer had chosen " + computerChoice);
                Wins += 1;
            } else {
                System.out.println("Oops! You Lost!! Computer had chosen " + computerChoice);
                Losses += 1;
            }

            System.out.println("Score:");
            System.out.println("Wins: " + Wins + " Losses: " + Losses + " Ties: " + Ties);
            System.out.println("Play again? (yes/no)");
            String playAgain = scn.nextLine();
            if(!playAgain.equalsIgnoreCase("yes")){
                keepPlaying = false;
            }
        }
    }
}