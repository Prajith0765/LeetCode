class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> ans = new ArrayList<>();
        StringBuilder cur = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            cur.append(s.charAt(i));

            if (cur.length() == k) {
                ans.add(cur.toString());
                cur.setLength(0); // reset the builder efficiently
            }
        }

        // Handle last group if it's not full
        if (cur.length() > 0) {
            while (cur.length() < k) {
                cur.append(fill);
            }
            ans.add(cur.toString());
        }

        // Convert the list to a String array
        return ans.toArray(new String[0]);
    }
}
