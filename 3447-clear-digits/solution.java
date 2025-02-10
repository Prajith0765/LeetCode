class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (!st.isEmpty()) {  
                    st.pop();
                }
            } else {
                st.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : st) {  
            result.append(c);
        }

        return result.toString();
    }
}
