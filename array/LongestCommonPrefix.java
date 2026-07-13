public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Input: [\"flower\",\"flow\",\"flight\"]");
        System.out.println("Output: " + solution.longestCommonPrefix(strs1));
        
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Input: [\"dog\",\"racecar\",\"car\"]");
        System.out.println("Output: " + solution.longestCommonPrefix(strs2));
    }

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