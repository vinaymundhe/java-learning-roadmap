package intermediate.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Convert:
["A", "B", "A", "B", "C"]

Into a frequency map using Streams.

(Hint: groupingBy + counting)
 */
public class StreamsFrequencyMap {
    public static void main(String[] args) {

        List<String> input = Arrays.asList("A", "B", "A", "B", "C");

        Map<String,Long> output = input.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println(output);
    }
}
