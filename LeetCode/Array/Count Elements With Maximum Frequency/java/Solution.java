class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        
        for (int n : nums) {
            freq[n]++;
        }
        
        int max = 0;
        for (int f : freq) {
            if (f > max) {
                max = f;
            }
        }
        
        int count = 0;
        for (int f : freq) {
            if (f == max) {
                count += f;
            }
        }
        
        return count;
    }
}