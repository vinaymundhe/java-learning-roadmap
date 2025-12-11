package intermediate.java8;

import java.util.ArrayList;
import java.util.List;

/*
Input:
["apple", "banana", "avocado", "grapes"]

Goal:
words starting with "a"

convert to uppercase
 */
public class StreamsFilterMap {
    public static void main(String[] args) {

        List<String> input = new ArrayList<>();
        input.add("apple");
        input.add("banana");
        input.add("avocado");
        input.add("grapes");

        List<String> output = input.stream()
                .filter(o -> o.startsWith("a"))
                .map(String::toUpperCase)
                .toList();

        System.out.println(output);
    }
}
