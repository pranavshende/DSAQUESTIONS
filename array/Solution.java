import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println("Input: nums = " + Arrays.toString(nums1) + ", target = " + target1);
        System.out.println("Output: " + solution.searchInsert(nums1, target1));
        
        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        System.out.println("Input: nums = " + Arrays.toString(nums2) + ", target = " + target2);
        System.out.println("Output: " + solution.searchInsert(nums2, target2));
        
        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        System.out.println("Input: nums = " + Arrays.toString(nums3) + ", target = " + target3);
        System.out.println("Output: " + solution.searchInsert(nums3, target3));
    }

    public int searchInsert(int[] nums, int target) {

        // Starting index
        int low = 0;

        // Ending index
        int high = nums.length - 1;

        // Binary Search
        while (low <= high) {

            // Find middle index
            int mid = low + (high - low) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Search in right half
            else if (nums[mid] < target) {
                low = mid + 1;
            }

            // Search in left half
            else {
                high = mid - 1;
            }
        }

        // Target not found.
        // 'low' is the correct insertion position.
        return low;
    }
}
