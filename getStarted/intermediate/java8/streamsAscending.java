package intermediate.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
You have a list of stock prices:
[120.5, 121.0, 119.8, 122.0, 121.0]

Remove duplicates
→ sort in ascending order
→ convert to a List.
 */
public class streamsAscending {
    public static void main(String[] args) {

        List<Double> input = Arrays.asList(120.5, 121.0, 119.8, 122.0, 121.0);

        List<Double> output = input.stream()
                .distinct()
                .sorted(Comparator.naturalOrder())
                .toList();

        System.out.println(output);
    }
}
