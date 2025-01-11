class Solution {
    public void rotate(int[] nums, int k) {
        // Step 1: Normalize k
        k = k % nums.length;

        // Step 2: Reverse the entire array
        reverse(nums, 0, nums.length - 1);

        // Step 3: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 4: Reverse the remaining element
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap elements between 'start' end 'end'
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // Move pointer
            start++;
            end--;
        }
    }
}