
class Solution {
    public boolean canJump(int[] nums) {
        // Step 1: Initialize maxReach to 0
        int maxReach = 0;

        // Step 2: Iterate over the array
        for (int i = 0; i <= maxReach; i++) {
            // Step 3: Update maxReach
            maxReach = Math.max(maxReach, i + nums[i]);

            // Step 4: If maxReach is greater than or equal to the last index, return true
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        // If we exit the loop, return false (edge case)
        return false;
    }
}