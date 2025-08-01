package intermediate.java8;

import java.util.Arrays;
import java.util.List;

// Find the sum of squares of all numbers in a list.
public class SumOfSquares {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sumOfSquares = numbers.stream()
                .map(num -> num * num)
                .reduce(0, Integer::sum);

        System.out.println("Sum of Squares: " + sumOfSquares); // Output: 55
    }
}
