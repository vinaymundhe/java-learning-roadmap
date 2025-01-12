package intermediate.collections;

import java.util.*;

/* Write a program that takes a sentence as input from the user, splits it into words, and then counts the unique words using a HashSet.*/
public class UniqueWordsCounter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String userInput = scn.nextLine();
        String [] inputInWords = userInput.split(" ");

        Set<String> uniqueWords = new HashSet<>();
        uniqueWords.addAll(Arrays.asList(inputInWords));
        System.out.println("Unique Words: "+uniqueWords);
        System.out.println("The number of unique words: "+ uniqueWords.size());
    }
}
