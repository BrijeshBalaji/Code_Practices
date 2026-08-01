class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer>set=new LinkedHashSet<>();
        for(int i:order){
        for(int n:friends){
            if(i==n){
                set.add(i);
            }
        }
    }
    int arr[]=new int[set.size()];
    int ind=0;
    for(int x:set){
        arr[ind++]=x;
    }
    return arr;
    }
}