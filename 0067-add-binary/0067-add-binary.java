class Solution {
    public String addBinary(String a, String b) {
        // Initialize pointers to traverse strings from the last character
        int n1 = a.length() - 1;
        int n2 = b.length() - 1;

        // Initialize carry to 0 and base for binary addition (base 2)
        int carry = 0, base = 2;

        // StringBuilder to construct the result binary string
        StringBuilder result = new StringBuilder();

        // Loop until both strings are processed or there's a remaining carry
        while (n1 >= 0 || n2 >= 0) {
            int t1 = 0, t2 = 0, sum;

            // If there are remaining digits in string 'a', get the current digit and decrement the pointer
            if (n1 >= 0) {
                t1 = a.charAt(n1--) - '0'; // Convert character to integer (binary digit)
            }

            // If there are remaining digits in string 'b', get the current digit and decrement the pointer
            if (n2 >= 0) {
                t2 = b.charAt(n2--) - '0'; // Convert character to integer (binary digit)
            }

            // Calculate the sum of the two digits and the carry
            sum = t1 + t2 + carry;

            // If the sum exceeds or equals the base (2), adjust the sum and set the carry
            if (sum >= base) {
                carry = 1;       // Carry will be 1 for the next higher position
                sum = sum - base; // Adjust sum by subtracting the base
            } else {
                carry = 0; // Reset carry to 0 if the sum is less than the base
            }

            // Append the current digit (sum) to the result
            result.append(sum);
        }

        // If there's a remaining carry after processing all digits, append it to the result
        if (carry == 1) {
            result.append(carry);
        }

        // Reverse the result string as we constructed it from least significant to most significant digit
        return result.reverse().toString();
    }
}
