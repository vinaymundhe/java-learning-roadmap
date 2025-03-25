package intermediate.streams;

import java.util.Arrays;
import java.util.List;

// Count how many words in a list have a length greater than 4.
public class WordsLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("stream", "java", "filter", "map", "collect");

        long count = words.stream()
                .filter(word -> word.length() > 4)
                .count();

        System.out.println("Words with length > 4: " + count); // Output: 3
    }
}
