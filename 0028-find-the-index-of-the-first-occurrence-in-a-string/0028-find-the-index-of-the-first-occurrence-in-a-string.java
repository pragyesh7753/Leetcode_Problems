class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            String currentSubstr = haystack.substring(i, i + needle.length());
            if (currentSubstr.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}