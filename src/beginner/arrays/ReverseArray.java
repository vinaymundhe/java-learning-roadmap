package beginner.arrays;

import java.util.Arrays;

// Reverse Array: Reverse the order of elements in an array.
public class ReverseArray {
    public static void main(String[] args) {

        int numbers [] = {11,22,33,4,5,6,7};

        String array = Arrays.toString(numbers);
        System.out.println("Array as string: "+array);

        String reversedArray ="";
        for (int i =0 ; i < array.length(); i++){
            reversedArray = array.charAt(i) + reversedArray;
        }
        System.out.println("Reversed Array: "+reversedArray);
    }
}