package intermediate.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Input:
["apple", "banana", "avocado", "grapes"]

Goal:
Get only words starting with "a".
 */
public class streamsFilter {
    public static void main(String[] args) {

        List<String> input = new ArrayList<>();
        input.add("apple");
        input.add("banana");
        input.add("avocado");
        input.add("grapes");

        List<String> output = input.stream()
                .filter(o -> o.startsWith("a"))
                .toList();

        System.out.println(output);
    }
}
