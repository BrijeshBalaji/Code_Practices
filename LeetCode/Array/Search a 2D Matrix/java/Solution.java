class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int arr[]:matrix){
            int right=arr.length-1;
            int left=0;
            int mid=0;
            while(left<=right){
                mid=left+(right-left)/2;
                if(arr[mid]==target){
                    return true;
                }
                if(arr[mid]<target){
                    left=mid+1;
                }
                else
                right=mid-1;
            }
           
        }
         return false;
    }
}