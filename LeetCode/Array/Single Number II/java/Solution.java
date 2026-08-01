class Solution {
    public int singleNumber(int[] a) {
        int c=1;
        for(int i=0;i<a.length;i++){
            c=1;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j] && i!=j){
                    c++;
                    break;
                }
            }
            if(c==1)
                return a[i];
        }
        return 0;
    }
}