package intermediate.java8;

import java.util.Arrays;
import java.util.List;

/*
Given a list of strings:
["Java", "Spring", "Boot", "Backend"]

Return a list of lengths:
[4, 6, 4, 7]

(Hint: map each string → string.length())
 */
public class StreamsListOfLengths {
    public static void main(String[] args) {

        List<String> input = Arrays.asList("Java", "Spring", "Boot", "Backend");

        List<Integer> output = input.stream()
                .map(s -> s.length())
                .toList();

        System.out.println(output);
    }
}
