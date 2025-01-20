import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        // Step 1: Sort the citations in ascending order
        Arrays.sort(citations);
        int n = citations.length;

        // Step 2: Iterate through the sorted array
        for (int i = 0; i < n; i++) {
            // Check if the current paper satisfies the H-Index condition
            if (citations[i] >= n - i) { // Here it starts comparing from the end of the array
                return n - i;
            }
        }
        // Step 3: If no valid H-Index is found, return 0
        return 0;
    }
}