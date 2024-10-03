class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder st = new StringBuilder();
        int num = columnNumber;
        while(num > 0){
            int r = (num - 1) % 26;
            st.append((char) (r + 'A'));
            num = (num - 1) / 26;
        }
        return st.reverse().toString();
    }
}
