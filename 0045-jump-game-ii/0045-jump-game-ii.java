class Solution {
    public int jump(int[] nums) {
        // Step 1: Initialize variables
        int jumps = 0; // Number of jumps taken
        int currentEnd = 0; // End of current jump range
        int maxReach = 0; // Maximum reach of current jump range

        // Step 2: Iterate through the array (excluding the last index)
        for (int i = 0; i < nums.length - 1; i++) {
            // Step 3: Update the farthest index reachable from index i
            maxReach = Math.max(maxReach, i + nums[i]);

            // If we reach the end of the current jump range
            if (i == currentEnd) {
                jumps++; // Increment the jump counter
                currentEnd = maxReach; // Update the current jump range
            }

            // If currentEnd reaches or exceeds the last index, break early
            if (currentEnd >= nums.length - 1) {
                break;
            }
        }
        // Step 3: Return the total number of jumps
        return jumps;
    }
}