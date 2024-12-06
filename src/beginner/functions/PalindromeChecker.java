package beginner.functions;

import java.util.Scanner;

// Palindrome Checker: Check if a string or number is a palindrome using a method.
public class PalindromeChecker {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String input = scn.nextLine();

        String rev = "";

        for (int i= input.length()-1; i>=0; i--){
            rev = rev + input.charAt(i);
        }

        if (rev.equals(input)){
            System.out.println("The input is a Palindrome");
        }
        else{
            System.out.println("The input is NOT a Palindrome");
        }
    }
}
