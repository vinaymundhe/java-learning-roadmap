package intermediate.java8;

import java.util.ArrayList;
import java.util.List;

/*
Employee names:
["vinay", "kunal", "raj", "nakul"]

Goal:
Return names longer than 4 letters.
 */
public class StreamsNameLength {
    public static void main(String[] args) {

        List<String> input = new ArrayList<>();
        input.add("vinay");
        input.add("kunal");
        input.add("raj");
        input.add("nakul");

        List<String> output = input.stream()
                .filter(o -> o.length() > 4)
                .toList();

        System.out.println(output);
    }
}
