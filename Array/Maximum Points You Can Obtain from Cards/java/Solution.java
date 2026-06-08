class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l=0;
        int r=0;
        for(int i=0;i<k;i++){
         l+=cardPoints[i];
        }
        for(int i=cardPoints.length-1;i>k;i--){
         r+=cardPoints[i];
        }
        return Math.max(l,r);
    }
}