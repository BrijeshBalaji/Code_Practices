class Solution {
    public int findComplement(int num) {
        int c = 1;
        int n = num;
        while (n > 0) {
            c = c << 1;
            n = n >> 1;
        }
        c = c - 1;
        return num ^ c;
    }
}