class Solution {
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