package intermediate.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
Java 8 program to find a minimum number from a stream.
Input: 5,4,3,8,7,6,1
 */
public class MinimumNumber {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,4,3,8,7,6);

        Integer minimumNum = list.stream().min(Comparator.naturalOrder()).orElse(null);
        System.out.println("Minimum Number from the list: "+ minimumNum);
    }
}
