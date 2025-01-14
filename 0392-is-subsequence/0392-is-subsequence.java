class Solution {
    public boolean isSubsequence(String s, String t) {
        // Step 1: Initialize pointers
        int i = 0; // Pointer for s
        int j = 0; // Pointer for t

        // Step 2: Iterate over the strings
        while (i < s.length() && j < t.length()) {
            // Step 3: Check if the characters match
            if (s.charAt(i) == t.charAt(j)) {
                i++; // ove pointer in s if characters match
            }
            j++; // Always move pointer in t

        }
        // Step 4: Check if all characters in s were matched
        return i == s.length(); // Return true if all characters in s are found in t
    }
}