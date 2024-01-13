class Solution {
    public int minSteps(String s, String t) {

         int[] alphabets = new int[26];

       for (char c : s.toCharArray()) {
           alphabets[c - 'a']++; 
       }

       int ans = 0;

       for (char c : t.toCharArray()) {

           if (alphabets[c - 'a'] == 0) {
               ans++;
           } 
           else {
               alphabets[c - 'a']--;
           }
       }

       return ans; 
    }
}