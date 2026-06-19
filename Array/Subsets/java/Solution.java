import java.util.*;

class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, 
                           List<Integer> tempList, 
                           int[] nums, 
                           int start) {

        result.add(new ArrayList<>(tempList));

        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);          // choose
            backtrack(result, tempList, nums, i + 1); // explore
            tempList.remove(tempList.size() - 1);     // un-choose
        }
    }
}