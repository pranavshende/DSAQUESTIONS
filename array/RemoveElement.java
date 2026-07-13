import java.util.*;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement solution = new RemoveElement();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println("Input array: " + Arrays.toString(nums) + ", val: " + val);
        int k = solution.removeElement(nums, val);
        System.out.println("Remaining elements count: " + k);
        System.out.print("Modified array: [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i < k - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    public int removeElement(int[] nums, int val) {

        // 'i' points to the next position where
        // a valid element (not equal to val) should be placed.
        int i = 0;

        // 'j' scans every element in the array.
        for (int j = 0; j < nums.length; j++) {

            // If the current element is NOT the value to remove,
            // keep it.
            if (nums[j] != val) {

                // Copy the valid element to index 'i'.
                nums[i] = nums[j];

                // Move 'i' to the next free position.
                i++;
            }

            // If nums[j] == val,
            // do nothing (skip it).
        }

        // 'i' is the number of elements remaining
        // after removing all occurrences of val.
        return i;
    }
}