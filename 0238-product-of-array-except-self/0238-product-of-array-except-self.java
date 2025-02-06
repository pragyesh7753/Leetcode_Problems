class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Array to store the product of all elements to the left of the current element
        int[] left = new int[nums.length];

        // Array to store the product of all elements to the right of the current
        // element
        int[] right = new int[nums.length];

        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        right[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // The product of all elements to the left of the current element multiplied by
        // the product of all elements to the right of the current element is the
        // product of all elements except the current element
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }
}