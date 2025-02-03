class Solution {
    public String removeDuplicates(String s) {
        char[] chrs = s.toCharArray();
        int index = -1;
        int n = chrs.length;
        for (int i = 0; i < n; i++) {
            if (index >= 0 && chrs[i] == chrs[index]) {
                index--;
            } else {
                index++;
                chrs[index] = chrs[i];
            }
        }
        return new String(chrs, 0, index + 1);
    }
}
