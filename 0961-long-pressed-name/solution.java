class Solution {
    public boolean isLongPressedName(String name, String typed) {
        // If typed is shorter than name, it's not possible
        if (name.length() > typed.length()) {
            return false;
        }
        
        int i = 0, j = 0;
        
        // Traverse both strings
        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                // If characters match, move both pointers forward
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                // If typed[j] is the same as typed[j-1], move j forward
                j++;
            } else {
                // If characters don't match and it's not a valid repetition, return false
                return false;
            }
        }
        
        // After the loop, if we've exhausted all characters in 'name', check if the rest of 'typed' 
        // consists only of repeated characters of the last character in 'name'.
        while (j < typed.length() && typed.charAt(j) == name.charAt(i - 1)) {
            j++;
        }
        
        // If we've processed all characters in 'name' and 'typed' ends at the same time, it's valid
        return i == name.length() && j == typed.length();
    }
}

