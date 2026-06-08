class Solution {
    public int candy(int[] ratings) {
        int r[] = new int[ratings.length];
        int l[] = new int[ratings.length];
        int sum = 0;

        l[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                l[i] = l[i - 1] + 1;
            } else {
                l[i] = 1;
            }
        }

        r[ratings.length - 1] = 1;
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                r[i] = r[i + 1] + 1;
            } else {
                r[i] = 1;
            }
        }

        for (int i = 0; i < ratings.length; i++) {
            sum += Math.max(l[i], r[i]);
        }

        return sum;
    }
}