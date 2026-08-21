class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start =0 ,end =0;
        for(int i=0;i<n;i++){
            int len1 = expand(s,i,i);
            int len2 = expand(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len>(end-start)){
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
        private int expand(String s,int left,int right){
            while(left>=0 && right<=s.length()-1 && s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }
            return right-left-1;
        }
        // int n = s.length();
        // String ans ="";
        // int max =0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<=n;j++){
        //         String res=s.substring(i,j);
        //         int left = 0;
        //         int right = res.length()-1;
        //         boolean b= true;
        //         while(left<right){
        //             if(res.charAt(left)==res.charAt(right)){
        //                 left++;
        //                 right--;
        //             }
        //             else{
        //                 b=false;
        //                 break;
        //             }
        //         }
        //         if(b && max<res.length()){
        //             max=res.length();
        //             ans= res;
        //         }
        //     }
        // }
        // return ans;
}