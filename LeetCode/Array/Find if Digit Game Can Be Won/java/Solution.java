class Solution {
    public boolean canAliceWin(int[] nums) {
        int single = 0, doubleD = 0;
        for (int n : nums) {
            if (n < 10) single += n;
            else doubleD += n;
        }
        return single != doubleD;
    }
}
