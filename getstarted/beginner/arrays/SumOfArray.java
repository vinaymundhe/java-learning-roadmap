package beginner.arrays;

import java.util.Arrays;

// Sum of Array: Input an array and calculate its sum.
public class SumOfArray {
    public static void main(String[] args) {

        int[] rollNo = {2, 2, 3, 4, 5, 6, 7};

        int sum = 0;
        for (int allRollNo : rollNo) {
            sum = allRollNo + sum;
//            sum = Arrays.stream(rollNo).sum();
        }
        System.out.println(sum);
    }
}
