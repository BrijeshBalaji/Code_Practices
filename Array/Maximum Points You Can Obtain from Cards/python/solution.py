        }
            sum += cardPoints[i];
        for (int i = 0; i < k; i++) {

        int sum = 0;

        int n = cardPoints.length;

    public int maxScore(int[] cardPoints, int k) {
class Solution {

        int max = sum;

        int left = k - 1;
        int right = n - 1;

        while (left >= 0) {
            sum -= cardPoints[left];
            sum += cardPoints[right];

            max = Math.max(max, sum);

            left--;
            right--;
        }

        return max;
