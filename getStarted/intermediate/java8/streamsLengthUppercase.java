package intermediate.java8;

import java.util.Arrays;
import java.util.List;

/*
Given:
["vinay", "rasika", "ram", "om"]

Return only names with length >= 4,
and convert them to UPPERCASE.
 */
public class streamsLengthUppercase {
    public static void main(String[] args) {

        List<String> input = Arrays.asList("vinay", "rasika", "ram", "om");

        List<String> output = input.stream()
                .filter(s-> s.length() >= 4)
                .map(String::toUpperCase)
                .toList();

        System.out.println(output);
    }
}
