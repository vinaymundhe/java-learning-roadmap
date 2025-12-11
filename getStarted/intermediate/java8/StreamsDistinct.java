package intermediate.java8;

import java.util.ArrayList;
import java.util.List;

/*
Input:
[1, 2, 2, 3, 3, 3, 4]

Goal: Remove duplicates.
 */
public class StreamsDistinct {
    public static void main(String[] args) {

        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(2);
        input.add(3);
        input.add(3);
        input.add(3);
        input.add(4);

        List<Integer> output = input.stream()
                .distinct()
                .toList();

        System.out.println(output);
    }
}
