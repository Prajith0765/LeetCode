class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }

        int current = 0;
        int maxlen = 0;
        int count = 0;
        
        for(int i = 1; i < s.length(); i++){
            for (int j = current; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    current = j + 1;
                }
            }
           count = i - current + 1; 
           if (count > maxlen) {
                maxlen = count;
            }
        }
        return maxlen;

    }
}