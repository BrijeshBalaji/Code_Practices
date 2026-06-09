class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int a=0;
        int b=arr.length-1;
        while(b-a+1>k){
            if(Math.abs(arr[a]-x) > Math.abs(arr[b]-x)){
                a++;
            }
            else{
                b--;
            }
           }
           for(int i=a;i<=b;i++){
            list.add(arr[i]);
           }
           return list;
        }
    }
