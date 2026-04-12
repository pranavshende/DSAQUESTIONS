//brute Force

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Loop through each element
        for(int i = 0; i < nums.length; i++) {

            // Check with every next element
            for(int j = i + 1; j < nums.length; j++) {

                // If sum equals target → return indices
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        // If no solution found (edge case)
        return new int[]{};
    }
}

//Hashmap Approach

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // HashMap to store value → index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse array
        for(int i = 0; i < nums.length; i++) {

            // Find required number to reach target
            int complement = target - nums[i];

            // Check if complement already exists in map
            if(map.containsKey(complement)) {
                // If yes → return indices
                return new int[]{map.get(complement), i};
            }

            // Store current number and its index
            map.put(nums[i], i);
        }

        // If no solution found (edge case)
        return new int[]{};
    }
}