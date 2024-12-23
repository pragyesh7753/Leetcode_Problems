class Solution {
    public int climbStairs(int n) {
        // Base cases
        if (n <= 2) {
            return n;
        }

        // Use two variables to store last two results
        int first = 1; // ways(1)
        int second = 2; // ways(2)

        // Iterate from 3 to n
        for (int i = 3; i <= n; i++) {
            int current = first + second; // ways(i) = ways(i - 1) + ways(i - 2)
            first = second; // Shift first to second
            second = current; // Update second to current
        }
        return second; // Result for ways(n)
    }
}
