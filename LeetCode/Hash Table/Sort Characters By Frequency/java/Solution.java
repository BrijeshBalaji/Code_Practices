class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];  

        
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

      
        StringBuilder result = new StringBuilder();

        while (true) {
            int max = 0;
            char ch = 0;

            for (char c = 0; c < 128; c++) {
                if (freq[c] > max) {
                    max = freq[c];
                    ch = c;
                }
            }

            if (max == 0) break; 

           
            for (int i = 0; i < max; i++) {
                result.append(ch);
            }

            freq[ch] = 0; 
        }

        return result.toString();
    }
}