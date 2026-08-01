class Solution {
    public int rob(int[] nums) {
        int size=nums.length;
        if(size==0)
        return 0;
        if(size==1)
        return nums[0];
        int dpcost[]=new int[size];
        dpcost[0]=nums[0];
        dpcost[1]=Math.max(nums[0],nums[1]);
        for(int ind=2;ind<size;ind++){
        dpcost[ind]=Math.max(dpcost[ind-2]+nums[ind],dpcost[ind-1]);
        }
        return dpcost[size-1];
    }
}