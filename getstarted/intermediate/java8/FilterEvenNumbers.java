package intermediate.java8;

import java.util.Arrays;
import java.util.List;

// Given a list of integers, filter and print only the even numbers.
public class FilterEvenNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numbers.stream()
                .filter(num -> num %2 == 0)
                .forEach(System.out::println);
    }
}
