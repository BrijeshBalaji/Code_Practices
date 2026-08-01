class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer>map=new TreeMap<>();
        List<String>list=new ArrayList<>();
        for(String word:words)
        map.put(word,map.getOrDefault(word,0)+1);
        for(int i=0;i<k;i++){
            String key="";
            int max=Integer.MIN_VALUE;
            for(Map.Entry<String,Integer>entry:map.entrySet()){
                if(entry.getValue()>max){
                    max=entry.getValue();
                    key=entry.getKey();
                }
            }
            list.add(key);
            map.put(key,-1);
        }
        return list;
    }
}
        
        