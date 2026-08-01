class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer>set = new TreeSet<>(Comparator.reverseOrder());
        for(int i:nums){
            set.add(i);
        }
        int ind = 0;
        int size = 0;
        if(k > set.size()) size = set.size();
        else size = k;
        int arr[] = new int[size];
        for(int i : set) {
            if(ind < size) arr[ind++] = i;
        }
        return arr;

    }
}