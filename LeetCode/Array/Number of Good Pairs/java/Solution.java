class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        int res = 0;
        for (int n : nums) {
            res += count[n];
            count[n]++;
        }
        return res;
    }
}
