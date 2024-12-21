class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            digits[i] += 1; // Add 1 to the current digit

            // If the digit is less than 10, no carry, return result
            if (digits[i] < 10) {
                return digits;
            }

            // If the digit becomes 10, set it to 0 and propagate carry
            digits[i] = 0;
        }

        // If we reach here, it means all digits were 9 and we have a carry
        int[] result = new int[n + 1];
        result[0] = 1; // Set the leading digit to 1 (e.g., 999 -> 1000)
        return result;
    }
}