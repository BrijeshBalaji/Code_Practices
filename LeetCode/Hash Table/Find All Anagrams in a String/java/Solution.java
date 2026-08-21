class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int k = p.length();
        List<Integer> list = new ArrayList<>();
        int pcount[]=new int[26];
        for(char c:p.toCharArray()){
             pcount[c-'a']++;
        }
        
        for(int i=0;i<=n-k;i++){
            int scount[]=new int[26];
            
            for(int j=i;j<i+k;j++){
                scount[s.charAt(j)-'a']++;
            }
            if(Arrays.equals(pcount,scount)){
                list.add(i);
            }
        }
        return list;
    }
}