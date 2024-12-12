package beginner.miniprojects;

import java.util.Random;
import java.util.Scanner;

/*
Mini Project: Hangman Game

- What You’ll Practice:
Arrays (to store the letters or words)
Loops (for repeated guessing attempts)
Conditionals (to check win/lose conditions)
String manipulation (revealing guessed letters)
Randomization (picking a random word)

- Requirements:
1. Word Selection:
Create an array of words (e.g., {"JAVA", "INTELLIJ", "LOOP", "ARRAY"}).
Randomly select one word at the start of the game.

2. Displaying Progress:
Represent the hidden word with underscores initially (e.g., if the word is "JAVA", display _ _ _ _).
Each time the user guesses a letter correctly, reveal that letter in the display.

3. Guessing Letters:
Prompt the user to guess a letter.
Check if the letter is in the word.
If correct, update the display. If incorrect, increment a “wrong guess” counter.

4. Win/Lose Conditions:
Win if all letters are revealed before the allowed number of wrong guesses (e.g., 6 attempts).
Lose if the user exceeds the maximum wrong guesses before revealing all letters.

5. Gameplay Loop:
Continue prompting for letters until the user wins or loses.
At the end, display a message: "You won! The word was: JAVA" or "You lost! The word was: JAVA".

6. Optional Enhancements:
Allow the user to guess the whole word at once.
Keep track of letters already guessed to prevent repeated attempts.
Add multiple rounds and keep a score count.
 */
public class HangmanGame {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String[] words = {"JAVA", "INTELLIJ", "LOOP", "ARRAY"};

        Random random = new Random();
        int randomWord = random.nextInt(words.length);
        String computerChoice = words[randomWord];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < computerChoice.length(); i++) {
            sb.append('_');
        }
        String underscoreString = sb.toString();

        System.out.println("Guess the following word: ");
        System.out.println(underscoreString);
        String userGuess = scn.next();

        for (int i=0; i < underscoreString.length(); i++){
            if (userGuess.equalsIgnoreCase(String.valueOf(underscoreString.charAt(i))){

        }
        }
    }
}