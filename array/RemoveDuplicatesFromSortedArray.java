import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();
        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        System.out.println("Input array: " + Arrays.toString(nums));
        int k = solution.RemoveDuplicatesFromSortedArray(nums);
        System.out.println("Number of unique elements: " + k);
        System.out.print("Modified array: [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i < k - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    public int RemoveDuplicatesFromSortedArray(int[] nums) {

        // 'i' points to the last unique element found.
        // Initially, the first element is always unique.
        int i = 0;

        // 'j' scans the array from the second element onwards.
        for (int j = 1; j < nums.length; j++) {

            // If current element is different,
            // we found a new unique element.
            if (nums[i] != nums[j]) {

                // Move 'i' to the next position
                // where the new unique element should be placed.
                i++;

                // Copy the new unique element to index 'i'.
                nums[i] = nums[j];
            }

            // If nums[i] == nums[j],
            // it is a duplicate, so do nothing.
            // Simply continue scanning with 'j'.
        }

        // Number of unique elements = last unique index + 1
        return i + 1;
    }
}