package intermediate.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
List<Integer> a = 1,3,5,7,8
List<Integer> b = 3,6,5

Find the elements which are present in both the list using java 8

output = List<Integer> c = 3,5
 */
public class ElementsInBothLists {
    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(1, 3, 5, 7, 8);
        List<Integer> b = Arrays.asList(3, 6, 5);

        List<Integer> commonElements = a.stream()
                .filter(b::contains)
                .collect(Collectors.toList());
        System.out.println(commonElements);
    }
}
