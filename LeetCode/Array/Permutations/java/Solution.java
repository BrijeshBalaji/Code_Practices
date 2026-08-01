class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean visited[]=new boolean[nums.length];
        permutation(nums,visited,list,new ArrayList<>());
        return list;
    }

    public void permutation (int nums[] , boolean visited[] , List<List<Integer>> list, List<Integer> temp){
        if(temp.size() == nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
            visited[i]=true;
            temp.add(nums[i]);
            permutation(nums , visited, list, temp);
            temp.remove(temp.size()-1);
            visited[i]=false;
        }
        }
    }
}