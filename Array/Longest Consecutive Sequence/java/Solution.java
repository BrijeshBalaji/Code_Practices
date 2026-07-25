class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();

        for(int num:nums){
            set.add(num);
        }
        int maxlength = 0;
        for(int num:nums){
            if(num != Integer.MIN_VALUE && set.contains(num-1)){
                continue;
            }
                int current = num;
                int length = 1;
                while(current != Integer.MAX_VALUE && set.contains(current+1)){
                    current++;
                    length++;
                }
                maxlength = Math.max(maxlength,length);
            }
            return maxlength;
        }
  }

