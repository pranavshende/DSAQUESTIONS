class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Traverse each character of the first string
        for (int i = 0; i < strs[0].length(); i++) {

            char ch = strs[0].charAt(i);

            // Compare this character with every other string
            for (int j = 1; j < strs.length; j++) {

                // If current string is shorter
                // OR characters don't match
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return strs[0].substring(0, i);
                }
            }
        }

        // If no mismatch was found, the first string itself is the answer
        return strs[0];
    }
}