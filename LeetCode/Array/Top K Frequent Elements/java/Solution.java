class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<k;i++){
            int maxfreq=0;
            int element =0;
             for(int key:map.keySet()){
            if(map.get(key) > maxfreq){
                maxfreq = map.get(key);
                element = key;
            }
        }
       set.add(element);
       map.remove(element);
        }
       int result[] = new int[set.size()];
       int i=0;
       for(int num:set){
        result[i]=num;
        i++;
       }
       return result;
    }
}
