package intermediate.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Write a method:

public Map<String, Integer> countFrequencies(List<String> items)

Example:
Input → ["A", "B", "A", "C", "B", "A"]
Output → {A=3, B=2, C=1}

No loops inside loops.
Use the correct collection + method.
 */
public class countFrequencyUsingMap {

    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("A");
        items.add("C");
        items.add("B");
        items.add("A");

        Map<String, Integer> result = countFrequencies(items);
        System.out.println(result);
    }

    public static Map<String, Integer> countFrequencies(List<String> items) {
        Map<String, Integer> map = new HashMap<>();

        for (String item : items) {
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
            }
        }
        return map;
    }
}
