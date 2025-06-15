class Solution {
    public int maxDiff(int num) {
        String numStr = String.valueOf(num);
        Set<Character> uniqueNum = new HashSet<>();
        for(char ch : numStr.toCharArray()){
            uniqueNum.add(ch);
        }

        int min = num, max = num;

        for(char ch : uniqueNum){
            for(char digit = '0'; digit <= '9'; digit++){
                if(numStr.charAt(0) == ch && digit == '0') continue;
                String newNumStr = numStr.replace(ch, digit);
                int newNum = Integer.parseInt(newNumStr);
                max = Math.max(max, newNum);
                min = Math.min(min, newNum);
            }
        }
        return max - min;
    }
}
