class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int max=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                sum++;
            }
            else{
                sum--;
            }
            if(map.containsKey(sum)){
                max = Math.max(max,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return max;
        // int n = nums.length;
        // int maxlen = 0;
        // int start = -1;
        // int end = -1;
        // for(int i=0;i<n;i++){
        //     int count0=0;
        //     int count1=0;
        //     for(int j=i;j<n;j++){
        //         if(nums[j]==1){
        //             count1++;
        //         }
        //         else{
        //             count0++;
        //         }
        //         if(count0==count1){
        //             int curr =j-i+1;
        //             if(curr>maxlen){
        //                 maxlen = Math.max(maxlen,curr);
        //             }
        //         }
        //     }
        // }
        // return maxlen;
    }
}