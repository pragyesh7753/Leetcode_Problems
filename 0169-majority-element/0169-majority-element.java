class Solution {
    public int majorityElement(int[] nums) {
        // Step 1: Initialize variables
        int candidate = 0;
        int count = 0;

        // Step 2: Find the candidate using Boyer-Moore Voting Algorithm
        for (int num : nums) {
            if (count == 0) {
                candidate = num; // Update candidate when count is 0
            }
            if (num == candidate) {
                count++; // Increment count if the number matches the candidate
            } else {
                count--; // Decrement count otherwise
            }
        }

        // Step 3: Return the candidate
        return candidate;
    }
}
