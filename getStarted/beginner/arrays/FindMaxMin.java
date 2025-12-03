package beginner.arrays;

import java.util.Arrays;
import java.util.OptionalInt;

// Find Maximum/Minimum: Determine the largest and smallest numbers in an array.
public class FindMaxMin {
    public static void main(String[] args) {

        int [] arr = {34,23,11,56,789,199};
        OptionalInt resMax = Arrays.stream(arr).max();
        System.out.println("Largest Number: "+resMax);

        OptionalInt resMin = Arrays.stream(arr).min();
        System.out.println("Smallest Number: "+resMin);
    }
}
