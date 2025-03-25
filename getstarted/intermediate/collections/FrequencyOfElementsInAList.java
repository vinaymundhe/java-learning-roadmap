package intermediate.collections;

import java.util.*;

/* Write a program to count the frequency of each element in a list of integers using a HashMap.*/
public class FrequencyOfElementsInAList {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter integers separated by spaces: ");
        String userInput = scn.nextLine();
        String [] inputSeparated = userInput.split(" ");

        List<Integer> inputAsInt = new ArrayList<>();

        for (String arr : inputSeparated){
            inputAsInt.add(Integer.parseInt(arr));
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : inputAsInt) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Number " + entry.getKey() + " appears " + entry.getValue() + " times");
        }
    }
}
