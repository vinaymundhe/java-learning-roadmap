package intermediate.java8;

import java.util.Arrays;
import java.util.List;

/*
Convert this:

List<String> sentences = List.of(
    "I love coding",
    "Java is powerful"
);

Output:
["I", "love", "coding", "Java", "is", "powerful"]

Hint:
First split each string into words → gives List<String[]>
Then flatten using flatMap.
 */
public class FlatMapWords {
    public static void main(String[] args) {
        List<String> sentences = List.of(
                "I love coding",
                "Java is powerful"
        );

        List<String[]> splitOutput = sentences.stream()
                .map(list -> list.split(" "))
                .toList();

        System.out.println("Split Output: " + Arrays.deepToString(splitOutput.toArray()));
        System.out.println("--------------");

        // Step 2: flatMap → flatten arrays into one list of words

        List<String> finalOutput = splitOutput.stream()
                .flatMap(array -> Arrays.stream(array))
                        .toList();

        System.out.println(finalOutput);
    }
}
