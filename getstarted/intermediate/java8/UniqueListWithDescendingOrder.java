package intermediate.java8;

import java.util.*;
import java.util.stream.Collectors;

/*
Java 8 program to merge two lists into a third list with unique numbers and in descending order.
 */
public class UniqueListWithDescendingOrder {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(1,2,3,6,7);

        Set<Integer> uniqueNumbers = new HashSet<>(list1);
        uniqueNumbers.addAll(list2);
        System.out.println("Merged list with unique numbers: "+ uniqueNumbers);

        List<Integer> descendingOrder = uniqueNumbers.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("In descending order: "+ descendingOrder);
    }

}
