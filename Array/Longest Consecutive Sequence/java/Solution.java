class Solution {
    public int longestConsecutive(int[] nums) {
        int maxlength = 0;
        for(int i=0;i<nums.length;i++){
            int current = nums[i];
            int length = 1;
            while(true){
                boolean found = false;
                for(int j=0;j<nums.length;j++){
                if(nums[j]==current+1){
                  found = true;
                  current++;
                  length++;
                  break;
                }
            }
            if(!found){
                    break;
                }
        }
      maxlength=Math.max(maxlength,length);
    }
    return maxlength;
  }
}
