class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();   //Trim the string and remove leading whitespaces

        String lastword = s.substring(s.lastIndexOf(' ') + 1);
        //Extract the substring starting from the last occurrence of space +1 to end
        return lastword.length();
    }
}