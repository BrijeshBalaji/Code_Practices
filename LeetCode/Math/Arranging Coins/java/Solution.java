class Solution {
    public int arrangeCoins(int n) {
        long N = n;
        long k = (long)((Math.sqrt(1 + 8 * N) - 1) / 2);
        return (int)k;
    }
}
