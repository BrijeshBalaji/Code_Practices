class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length();
        int left = 0;
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        for(int right=0;right<n;right++){
            if(right - left + 1 ==10){
               String sub = s.substring(left,right+1);
            
            if(seen.contains(sub)){
                repeated.add(sub);
            }
            else{
                seen.add(sub);
            }
            left++;
            }
        }
        return new ArrayList<>(repeated);
    }
}