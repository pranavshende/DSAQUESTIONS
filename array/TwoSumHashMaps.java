import java.util.*;

public class TwoSumHashMaps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Call function
        int[] result = twoSum(nums, target);

        // Output result
        if(result.length == 2) {
            System.out.println("Indices: " + result[0] + " " + result[1]);
        } else {
            System.out.println("No solution found");
        }

        sc.close();
    }

    // Optimal HashMap function
    public static int[] twoSum(int[] nums, int target) {

        // Store value → index
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            // Check if complement exists
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Store current element
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}