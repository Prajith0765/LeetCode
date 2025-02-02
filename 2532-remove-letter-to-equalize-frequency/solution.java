import java.util.*;

class Solution {
    public boolean equalFrequency(String word) {
        int[] freq = new int[26];

        // Step 1: Count character frequencies
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        // Step 2: Try removing one occurrence of each character
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) continue; // Ignore characters not in the word
            
            freq[i]--; // Temporarily remove one occurrence
            Set<Integer> uniqueFreq = new HashSet<>();

            // Step 3: Collect unique non-zero frequencies
            for (int f : freq) {
                if (f > 0) uniqueFreq.add(f);
            }

            freq[i]++; // Restore frequency

            if (uniqueFreq.size() == 1) return true; // If all remaining frequencies are the same, return true
        }

        return false;
    }
}

