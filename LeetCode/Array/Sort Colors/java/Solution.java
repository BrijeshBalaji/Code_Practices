class Solution {
    public void sortColors(int[] nums) {
        int low = 0 ,mid = 0,high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                nums[mid]=nums[low];
                nums[low]=0;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                nums[mid]=nums[high];
                nums[high]=2;
                high--;
            }
        }
        // int countzero = 0;
        // int countone = 0;
        // int counttwo = 0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         countzero++;
        //     }
        //     if(nums[i]==1){
        //         countone++;
        //     }
        //     if(nums[i]==2){
        //         counttwo++;
        //     }
        // }
        // int i=0;
        // while(countzero>0){
        //     nums[i]=0;
        //     i++;
        //     countzero--;
        // }
        // while(countone>0){
        //     nums[i]=1;
        //     i++;
        //     countone--;
        // }
        // while(counttwo>0){
        //     nums[i]=2;
        //     i++;
        //     counttwo--;
        // }
    }
}