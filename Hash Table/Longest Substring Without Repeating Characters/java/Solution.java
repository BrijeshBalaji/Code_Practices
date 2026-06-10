class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        int[] index = new int[128]; 
        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            left = Math.max(index[c], left); 
            maxLength = Math.max(maxLength, right - left + 1);
            index[c] = right + 1; 
        }

        return maxLength;
    }
}