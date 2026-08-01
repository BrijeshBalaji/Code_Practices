class Solution {
    public int countDigitOne(int n) {
        long count =0;
        long place=1;
        while(place<=n){
            long left=n/(place*10);
            long digit=(n/place)%10;
            long right=n%place;

            if(digit==0){
                count+=left*place;
            }
            else if(digit==1){
                count+=left*place+(right+1);
            }
            else{
                count+=(left+1)*place;
            }
            place*=10;
        }
        return (int) count;
    }
}