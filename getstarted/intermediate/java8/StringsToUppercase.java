package intermediate.java8;

import java.util.Arrays;
import java.util.List;

// Given a list of strings, convert them to uppercase.
public class StringsToUppercase {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John","Vinay","Anjali","Rasika");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
