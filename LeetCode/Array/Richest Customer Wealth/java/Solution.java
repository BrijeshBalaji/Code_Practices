class Solution {
    public int maximumWealth(int[][] accounts) {
       int max=0;
       for(int arr[]:accounts){
        int sum=0;
        for(int i:arr){
            sum=sum+i;
        }
        if(sum>max) max=sum;
       }
       return max;   
    }
}