class Solution {
    private void solve(int index, String digits, String[] comb, List<String> ans, StringBuilder temp) {
        if (index == digits.length()) {
            ans.add(temp.toString());
            return;
        }

        for (char ch : comb[digits.charAt(index) - '0'].toCharArray()) {
            temp.append(ch);
            solve(index + 1, digits, comb, ans, temp);
            temp.deleteCharAt(temp.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();
        String[] comb = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans = new ArrayList<>();
        solve(0, digits, comb, ans, new StringBuilder());
        return ans;
    }
}
