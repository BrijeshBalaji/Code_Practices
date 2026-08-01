class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int ind=0;
        int arr[]=new int[matrix.length*matrix.length];
        for(int arr1[]:matrix){
            for(int i:arr1){
                arr[ind++]=i;
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}