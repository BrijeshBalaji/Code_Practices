class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();
        for(String str :strs){
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());

        // List<List<String>> result = new ArrayList<>();
        // boolean visited [] = new boolean[strs.length];
        // for(int i=0;i<strs.length;i++){
        //     List<String> group = new ArrayList<>();
        //     if(visited[i]){
        //         continue;
        //     }
        //     group.add(strs[i]);
        //     visited[i]=true;
        //     for(int j=i+1;j<strs.length;j++){
        //         if(visited[j]){
        //             continue;
        //         }
        //         if(strs[i].length()==strs[j].length()){
        //             char ch[]  = strs[i].toCharArray();
        //             char ch1[] = strs[j].toCharArray();

        //             Arrays.sort(ch);
        //             Arrays.sort(ch1);

        //             if(Arrays.equals(ch,ch1)){
        //                 group.add(strs[j]);
        //                 visited[j]=true;
        //             }
        //         }
        //     }
        //     result.add(group);
        // }
        // return result;
    }
}
