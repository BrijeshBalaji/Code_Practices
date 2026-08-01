class Solution {
    public boolean canJump(int[] nums) {
        int finalpos=nums.length-1;
        for(int val=nums.length-2;val>=0;val--){
            if(val+nums[val]>=finalpos){
                finalpos=val;
            }
        }
        return finalpos==0;
    }
}