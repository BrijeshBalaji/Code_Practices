class Solution {
    public int maximumGap(int[] nums) {
      int max=0;
      Arrays.sort(nums);
      if(nums.length<2){
        return 0;
      }
      for(int i=1;i<nums.length;i++){
        int dif=nums[i]- nums[i-1];
        max=Math.max(dif,max);
      }
      return max;
    }
}