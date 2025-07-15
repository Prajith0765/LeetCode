class Solution {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) return 0;

        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int maxlength = 0;
        boolean found = false;

        for(int count : map.values()){
            if(count % 2 == 0){
                maxlength += count;
            } else {
                maxlength += count - 1;
                found = true;
            }
        }

        if(found){
            maxlength++;
        }

        return maxlength;
    }
}
